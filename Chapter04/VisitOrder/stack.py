#!/usr/bin/python

class Stack:

    stack = []

    def length(self):
        return len( self.stack )

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
        print "len( self.stack ): " + str( len( self.stack ) )
        if len( self.stack ) <= 0:
            return None
        node = self.stack[ 0 ]
        print "length of stack ===>" + str( len( self.stack ))
        print "pop length of [" + str(node.value) + "] = " + str( len( node.value ) )
        self.stack.remove( node )
        return node 

    def print_stack(self):
        print '========= Printing Stack Start ============'
        for i in self.stack:
            print 'print_stack = ' + i.value
        print '========== Printing Stack End ============'
            

    def __init__( self ):
        pass
