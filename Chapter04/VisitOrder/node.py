#!/usr/bin/python

class Node:

    def __init__( self ):
        self.id = 0
        self.parent_id = 0
        self.value = "" 
        self.position = ""   # Relative to parent: L - Left, R - Right
        self.left  = None
        self.right = None
