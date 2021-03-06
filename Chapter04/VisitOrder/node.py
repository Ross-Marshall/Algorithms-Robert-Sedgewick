#!/usr/bin/python

class Node:

    def __init__( self, value, id, parent_id, position ):
        self.id = id
        self.parent_id = parent_id
        self.value = value 
        self.position = position   # Relative to parent: L - Left, R - Right
        self.left  = None
        self.right = None

    def print_node( self ):
         return '[' + str(self) + ',' + self.id + ',' + self.parent_id + ',' + self.value + ',' + self.position + ',' + str( self.left ) + ',' + str( self.right ) + ']'  
