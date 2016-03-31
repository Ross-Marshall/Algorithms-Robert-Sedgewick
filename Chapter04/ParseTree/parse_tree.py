#!/usr/bin/python

import os
import sys 

from node import Node

def main(args):
    print "Parse Tree..."
    if ( len( args ) < 2 ):
        print "Usage ./parse_tree.py 'List of arguments in string'"
        sys.exit(-1) 

    tokens = args[1].split()

    z = Node()
    z.left  = z
    z.right = z

    for token in tokens:
        print token 
        x = Node()
        x.value = token 
        x.left  = z 
        x.right = z

if __name__ == "__main__":
    main( sys.argv )
