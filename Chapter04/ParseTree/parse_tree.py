#!/usr/bin/python

import os
import sys 

from node import Node
from stack import Stack

def main(args):
    print "Parse Tree..."
    if ( len( args ) < 2 ):
        print "Usage ./parse_tree.py 'List of arguments in string'"
        sys.exit(-1) 

    print "Arguments:[ " + args[1] + " ]"
    tokens = args[1].split()

    z = Node()
    z.left  = z
    z.right = z

    stack = Stack()
    stack.print_stack()

    for token in tokens:
        print token 
        x = Node()
        x.value = token 
#        x.left  = z 
#        x.right = z

        # If the token is an operator. Pop and set the right link 
        # then pop and set the left link then push the token on the stack.
        # Otherwise, push the token on to the stack.
        if token == '+' or token == '*':
            x.right = stack.pop()
            print "Poping " + x.right.value + " from the stack and set to right link of " + token 
            x.left  = stack.pop()
            print "Poping " + x.left.value + " from the stack and set to left link of " + token 
        print "Pushing " + str( x.value ) + " to the stack"
        stack.push( x );

    stack.print_stack()

if __name__ == "__main__":
    main( sys.argv )
