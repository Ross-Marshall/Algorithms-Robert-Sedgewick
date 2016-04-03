#!/usr/bin/python

import os
import sys 

from node import Node
from stack import Stack

def visit( node, z ):
    print "Node->value = " + str( node.value ) 

def traverse( t ):
    print "Entering traverse..." + str( t.value )
    #t = stack.pop()

    #while ( t != None ):
        
    if ( t.right != None ):
        traverse( t.right )
    if ( t.left != None ):
        traverse( t.left )

        #t = stack.pop()
        #print "traverse: poping t...." + str( t.value )
        #if ( t.left != None ):
        #    print "traverse: poping t.left ..." + str( t.left.value )
        #if ( t.right != None ):
        #    print "traverse: poping t.right ..." + str( t.right.value )
        #visit( t, z )
        #if ( t.right != None ):
            #stack.push( t.right )
        #    traverse( t.right )
        #    print "traverse: poping t.right ...." + str( t.value )
        #if ( t.left != None ):
            #stack.push( t.left )    
        #    t = t.left
        #    print "traverse: poping t.left  ...." + str( t.value )

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

    root = None

    for token in tokens:
        print token 
        x = Node()
        x.value = token 

        # If the token is an operator. Pop and set the right link 
        # then pop and set the left link then push the token on the stack.
        # Otherwise, push the token on to the stack.
        if token == '+' or token == '*':
            x.right = stack.pop()
            print "Poping " + x.right.value + " from the stack and set to right link of " + token 
            x.left  = stack.pop()
            print "Poping " + x.left.value + " from the stack and set to left link of " + token 
        print "Pushing " + str( x.value ) + " to the stack"
        stack.push( x )
        print "stack after the push..."
        stack.print_stack()
        root = x

    stack.print_stack()

    traverse( root );

if __name__ == "__main__":
    main( sys.argv )
