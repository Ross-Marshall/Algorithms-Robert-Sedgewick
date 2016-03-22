public class ArrayQueue {

    private int [] queue;
    private int head;
    private int tail;
    private int size;

    public ArrayQueue( int max ) {
    
         queue = new  int[ max ];
         head = 0;
         tail = 0;
         size = max+1;
    }

    public void put( int value ) {
       if ( tail == size-1 ) {
          System.out.println( "Tail location [" + tail + "] has reached the max size [" + size + "]" );
          return;
       }
       queue[ tail++ ] = value;
       if ( tail > size ) tail = 0;
    }

    public int get() {
       int t = queue[ head++ ];
       if ( head > size ) head = 0;
       return t;
    }

    public boolean empty() {
        return ( head == tail );
    }

    public int getQueueSize() {
        return size;
    }

    public void printQueue() {
        System.out.println ( "----------- Print Queue ------------" );
        for ( int i = head ; i < tail ; i++ ) {
            System.out.println( i + ". value [" + queue[i] + "]" ); 
        }
    }

    public static void main ( String [] args ) {
       
        ArrayQueue aq = new ArrayQueue( Integer.parseInt( args[ 0 ] ) );
        System.out.println( "Max queue size = " + aq.getQueueSize() );

        aq.put( 10 );
        aq.put( 20 );
        aq.put( 30 );
        aq.printQueue();

        aq.put( 11 );
        aq.put( 21 );
        aq.put( 31 );
        aq.printQueue();

        aq.get();
        aq.printQueue();

        aq.get();
        aq.printQueue();

        aq.get();
        aq.printQueue();

        aq.get();
        aq.printQueue();


    }
}
