#!/usr/bin/python

import os
import sys

from node import Node
from stack import Stack

class VisitOrder:
  
    stack = None 
    level = 0

    node_list = []

    def __init__( self ):
        self.stack = Stack()

    def make_stack( self ):
        while self.stack.length() > 0:
            print "self.stack.length() ==> " + str( self.stack.length() )
            print "Pop the stack ---> " + str( self.stack.pop().value )

    def get_node( self, node_id ):
        for n in self.node_list:
            #print 'get_node ' + str( n.id )
            if n.id == node_id:
                return n
        return None

    def build_tree( self, node ):
         self.level = self.level + 1
         print "in build_tree level : " + str( self.level )
         while len( node.value ) > 0:
             node.left = self.stack.pop() 
             build_tree( node.left )
         
         while len( node.value ) > 0:
             node.right = self.stack.pop()
             build_tree( node.right )
  
if __name__ == "__main__":
    #print str( sys.argv[1] )
    
    print "Visit Order"
    vo = VisitOrder()
    if ( len( sys.argv ) < 2 ):
        print "Usage ./visit_order.py 'List of comma separated arguments in string'"
        sys.exit(-1)
    print "Arguments:[ " + sys.argv[1] + " ]"
    tokens = sys.argv[1].split('|')

    for token in tokens:
        print token
        members = token.split(',')
        # value, id, parent, position relative to parent: L - Left, R - Right
        node = Node(members[0], members[1], members[2], members[3] )
        vo.node_list.append( node )

    print str( vo.node_list )
    #vo.make_stack ()

    for n in vo.node_list:
        parent_node = vo.get_node( n.parent_id )
        print 'DEBUG node n ====> ' + n.id
        if parent_node != None:
            print 'DEBUG parent ====> ' + parent_node.id
            print 'DEBUG n (parent) > ' + n.parent_id
            print '====================================='
            if n.position == 'L':
                parent_node.left = n
            elif n.position == 'R':
                parent_node.right = n
            elif n.position == 'T':
                print n.id + ' parent is the root of the tree'
                if n.position == 'L':
                    parent_node.left = n
                elif n.position == 'R':
                    parent_node.right = n
                else:
                    print 'Node ' + n.id + ' has an invalid position: ' + str( n.position )
            else:
                print 'ERROR: ' + n.id + ' has an invalid position value [' + n.position + ']'

    for n in vo.node_list:
        print n.print_node() 

 
    #vo.build_tree( vo.stack.pop() )


