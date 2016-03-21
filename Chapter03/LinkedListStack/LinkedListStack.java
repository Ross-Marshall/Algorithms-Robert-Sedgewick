public class LinkedListStack {

    private Node head;
    private Node z;

    public LinkedListStack( long max ) {
       head = new Node ();
       z = new Node ();
       head.next = z;
       z.next = z;
    }
    
    public void push( long value ) {
        Node t = new Node();
        //System.out.println( "DEBUG Pushing: " + value );
        t.key = value;
        t.next = head.next;
        head.next = t;
    }

    public long pop() {
        long x;
        Node t = new Node();
        t = head.next;
        head.next = t.next;
        x = t.key;
        return x;
    }

    public void printStack() {
        System.out.println( "--- Printing the Stack ---" );
        Node n = head;
        while ( true ) {
             System.out.println( "Node value : " + n );
             if ( n == n.next ) {
                 //System.out.println( "Break out of the loop..." );
                 break;
             }
             n = n.next;
            
        }
    }

    public static void main( String [] args ) {

        System.out.println( "Linked List Implementation of Stacks" );

        LinkedListStack lls = new LinkedListStack(100);

        lls.push( 10 );
        lls.push( 20 );
        lls.push( 30 );

        System.out.println( "Head : " + lls.head );
        System.out.println( "Head.next: " + lls.head.next );
        
        lls.printStack();

        lls.push( 40 );
        lls.push( 50 );
        lls.push( 60 );
        lls.printStack();

        lls.pop();
        lls.printStack();

        lls.pop();
        lls.printStack();
 
        lls.push( 70 );
        lls.push( 80 );
        lls.printStack();

        
    }

}
