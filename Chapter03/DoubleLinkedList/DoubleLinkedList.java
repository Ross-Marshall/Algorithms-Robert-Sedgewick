import java.util.Random;

public class DoubleLinkedList {

    public Node head;
    public Node tail;
        
    public DoubleLinkedList() {
        head = new Node( 0 );
        tail = new Node( -1 );
        head.next = tail;
        head.prev = null;
        tail.next = null;
        tail.prev = head;
    }

    public void printDoubleLinkedList() {
        Node n = head;
        int counter = 0;

        System.out.println( " ============ Print Double Linked List =============" );
        while ( n != null ) {

          System.out.println( "Node[" + (counter++) + "] ==> " + n );
          n = n.next;  

        } ;
    }

    public void insert( Node n, int pos ) {

         Node m = head;
         int counter = 0;
         Node prev;
         Node next;

         while ( m != null ) {
            if ( counter == pos ) {
               prev = m.prev;
               next = m;
              
               prev.next = n;
               n.prev = prev;

               next.prev = n;
               n.next = next;

               return;
            }
            counter++;
            m = m.next;
             
         }
    }


    public void delete( int pos ) {

         Node m = head;
         int counter = 0;
         Node prev;
         Node next;

         while ( m != null ) {
            if ( counter == pos ) {
               prev = m.prev;
               next = m;
              
               prev.next = m.next;
               m.prev = prev;

               return;
            }
            counter++;
            m = m.next;
             
         }
    }

    public void buildFirstHalf() {
         Node n;
         int pos;

         for ( int i = 0 ; i < 25 ; i++ ) {
              pos = i+1;
              n = new Node( pos );
              insert( n, pos );              
         }
    }

    public void buildSecondHalf() {
         Random rand = new Random(93827); 
         Node n;
         int pos = 26;
         int id;
 
         while ( pos <= 50 ) {
              id = rand.nextInt(499) + 125;  // Random number between 125 and 500.
              n = new Node( id );
              insert( n, pos ); 
              pos++;             
         }
    }


    public static void main ( String [] args ) {

        DoubleLinkedList dl = new DoubleLinkedList();

        dl.printDoubleLinkedList();

        dl.buildFirstHalf();
        dl.buildSecondHalf();

        dl.printDoubleLinkedList();

        dl.delete( 10 );
        dl.delete( 20 );
        dl.delete( 45 );

        Node x = new Node( 1092 );
        dl.insert( x, 17 );

        dl.printDoubleLinkedList();
    
    }

}
