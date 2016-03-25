public class Exchange {

    public Node head;

    public Node tail;
   
    public void printList() {
        Node n = head;
        int counter = 0;
        System.out.println( "------------------------------------" );
        do { 
            System.out.println( "Node: " + ( counter++ ) + ". Key [ " + n.id + " ]" );
            n = n.next;
        } while ( n.id != tail.id ); 
    }

    public Node getNode( int id ) {
        Node n = head;
        do {
          if ( n.id == id ) return n;
          n = n.next;
        } while ( n.id != tail.id );
        return null;
    }

    public void addNode( Node n ) {
 
        n.next = head.next;
        head.next = n;
        
    }

    public void exchange( Node t, Node u ) {
        Node tPrev;
        Node uPrev;
        Node n;
        Node tmp;

        tPrev = head;
        n     = head;
        uPrev = tail;

        do {      
            if ( n.next.id == t.id ) tPrev = n;
            if ( n.next.id == u.id ) uPrev = n;
            n = n.next;
        } while ( n.id != tail.id );

        n = head;

        tmp = t.next;
        tPrev.next = u;
        uPrev.next = t;
        t.next = u.next;
        u.next = tmp;

    }

    public static void main( String [] args ) {

         Exchange ex = new Exchange();
         Node t;
         Node u;

         ex.head = new Node( -1 );
         ex.tail = new Node( -2 );
         ex.head.next = ex.tail;
         ex.tail.next = ex.tail;

         ex.printList();

         for ( int i = 25 ; i >= 0 ; i-- ) {
              t = new Node( i );
              ex.addNode( t );
         }
         ex.printList();

         t = ex.getNode( 8 );
         u = ex.getNode( 19 );
         System.out.println( "------------------------------------" );
         System.out.println( "t id = " + t.id + " u id = " + u.id );
         ex.exchange( t, u );
         ex.printList();

         t = ex.getNode( 3 );
         u = ex.getNode( 5 );
         System.out.println( "------------------------------------" );
         System.out.println( "t id = " + t.id + " u id = " + u.id );
         ex.exchange( t, u );
         ex.printList();


    }
}
