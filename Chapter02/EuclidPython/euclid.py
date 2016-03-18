#!/usr/bin/env python

"""Euclid's Algorithm
"""

import os
import sys

def main(arguments):

    u = int ( arguments[0] )
    v = int ( arguments[1] )
    print "The Greatest Common Divisor of " + str(u) + " and " + str(v) + " is " + str( gcd( u, v ) )

def gcd( u, v ):
    while ( u > 0 ):
        if ( u < v ):
            t = u
            u = v
            v = t
        u = u - v         

    return v

if __name__ == '__main__':
    main(sys.argv[1:])
    
    sys.exit(0)

