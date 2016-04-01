#!/usr/bin/python

class Stack:

    stack = []

    def push( self, node ):
        self.stack.append( node )

    def pop(self):
        value = self.stack[ -1 ]
        self.stack.remove( value )
        return value 

    def print_stack(self):
        print '========= Printing Stack Start ============'
        for i in self.stack:
            print 'print_stack = ' + i.value
        print '========== Printing Stack End ============'
            

    def __init__( self ):
        pass
