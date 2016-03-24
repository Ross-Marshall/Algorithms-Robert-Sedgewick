public class MoveNextToFront {
        
    Node head = new Node( -1 );
    Node tail = new Node( -2 );

    public void moveNextToFront( int key ) {
        Node m = this.head;
        while ( m.getKey() != key-1 ) {
            m = m.getNext();
        }
        System.out.println( "moveNextToFront : "  + m.getKey() );
   
        Node n = m.getNext();

        System.out.println( "moveNextToFront : "  + n.getKey() );
        System.out.println( "n.getNext() = " + n.getNext().getKey() );
        System.out.println( "head.getNext() = " + head.getNext().getKey() );
        System.out.println( "m.getNext() = " + m.getNext().getKey() );

        m.setNext( n.getNext() );
        n.setNext( head.getNext() );
        head.setNext( n );
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int MAX = 25;
        Node t;

        MoveNextToFront m = new MoveNextToFront();
        m.head.setNext( m.tail );
        m.tail.setNext( m.tail );

        for (int i = 0; i <= MAX ; i++) {
            t = new Node( i );
            t.setNext( m.head.getNext() );
            m.head.setNext( t );
        }
        
        t = m.head;
        while (t != t.getNext()) {
            System.out.println( "Key: " + t.getKey() );
            t = t.getNext();
        }

        m.moveNextToFront( 12 );
        
        System.out.println( "After moveNextToFront()....." );
        t = m.head;
        while (t != t.getNext()) {
            System.out.println( "Key: " + t.getKey() );
            t = t.getNext();
        }
    }
}
