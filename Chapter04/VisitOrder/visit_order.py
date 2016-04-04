#!/usr/bin/python

import os
import sys

from node import Node
from stack import Stack

def build(node, stack):
    print "Node->value = " + str( node.value )
    if stack.empty() != False:
       node.left = stack.pop()
       build(node.left)
    if stack.empty() != False:
       node.right = stack.pop()
       build(node.right)

def main(args):
    print args[1]
    print "Visit Order"
    if ( len( args ) < 2 ):
        print "Usage ./visit_order.py 'List of comma separated arguments in string'"
        sys.exit(-1)

    print "Arguments:[ " + args[1] + " ]"
    tokens = args[1].split(',')

    stack = Stack()

    for token in tokens:
        print token
        node = Node()
        node.value = token
        stack.push( node ) 

    stack.print_stack()

    while ( stack.empty() == False ):
        t = stack.pop()
        build( t, stack )
        
if __name__ == "__main__":
    main( sys.argv )
