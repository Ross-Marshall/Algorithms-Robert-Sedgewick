
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
               next = m.next;
System.out.println( "prev.id" + prev.id );
System.out.println( "next.id" + next.id );
               
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

    public void buildFirstHalf() {
         Node n;
         int pos;

         for ( int i = 0 ; i < 25 ; i++ ) {
              pos = i+1;
              n = new Node( pos );
              insert( n, pos );              
         }
       

    }

    public static void main ( String [] args ) {

        DoubleLinkedList dl = new DoubleLinkedList();

        dl.printDoubleLinkedList();

        dl.buildFirstHalf();

        dl.printDoubleLinkedList();
        
    }

}