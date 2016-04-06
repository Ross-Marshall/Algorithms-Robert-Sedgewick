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
            #print "Pop the stack ---> " + str( self.stack.pop().value )


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
    tokens = sys.argv[1].split(',')

    for token in tokens:
        print token
        node = Node()
        node.value = token
        vo.stack.push( node ) 

    vo.stack.print_stack()

    #vo.make_stack ()

    vo.build_tree( vo.stack.pop() )


