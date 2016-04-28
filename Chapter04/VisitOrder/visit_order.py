#!/usr/bin/python

import os
import sys

from node import Node
from stack import Stack

class VisitOrder:
  
    stack = None 
    level = 0

    def __init__( self ):
        self.stack = Stack()

    def make_stack( self ):
        while self.stack.length() > 0:
            print "self.stack.length() ==> " + str( self.stack.length() )
            print "Pop the stack ---> " + str( self.stack.pop().value )

    def get_node( self, parent_id ):
        for n in node_list:
            #print 'get_node ' + str( n.parent_id )
            if n.parent_id == parent_id:
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
    node_list = []
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
        node_list.append( node )

    print str( node_list )
    #vo.make_stack ()

    for n in node_list:
        print n.value

    print 'Node 101 : ' + str( vo.get_node( '101' ) )

    print 'Node Unknown : ' + str( vo.get_node( '888' ) )

 
    #vo.build_tree( vo.stack.pop() )


