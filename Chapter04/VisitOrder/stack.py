#!/usr/bin/python

class Stack:

    stack = []

    def empty(self):
        print "len( self.stack ) = " + str( len( self.stack ) )
        print "stack = " + str( self.stack )
        self.print_stack()
        if len( self.stack ) == 0:
           return True
        else:
           return False

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
