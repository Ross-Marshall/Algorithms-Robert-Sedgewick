public class LinkedListStringQueue {

    private StringNode queue;
    private StringNode head;
    private StringNode tail;
    private int size = 0;

    public LinkedListStringQueue() {
    
         head = new StringNode();
         tail = new StringNode();
         head.next = tail;
         tail.next = tail;
    }

    public void put( String value ) {
       StringNode t = new StringNode();
       t.key = value;
       t.next = head.next; 
       head.next = t; 
       size++;     
    }

    public String get() {
       StringNode t = head.next;
       head.next = t.next;
       size--;
       return t.key;
    }

    public boolean empty() {
        return ( head.next == tail );
    }

    public int getQueueSize() {
        return size;
    }

    public void printQueue() {
        System.out.println ( "----------- Print Queue ------------" );
        StringNode i = head;
        int counter = 0;
        while ( i.next != tail   ) {
            i = i.next;
            System.out.print( "[ " + i.key + " ]-->" );           
            counter++;
        }
        System.out.println( "NULL\nTotal number of items = " + counter );
    }

    public static void main ( String [] args ) {
       
        if ( args.length < 1 ) {
            System.out.println( "Usage: java LinkedListStringQueue <Input String>" );
            System.exit(-1);
        }

        LinkedListStringQueue queue = new LinkedListStringQueue();

        String [] tokens = args[0].split(" ");
        String ch = null;
        String SPLAT = "*";

        for ( String token : tokens ) {
            if ( token.equals( SPLAT ) ) {
                queue.get(); 
            } else {
                queue.put( token );
            }
            queue.printQueue();
        }

    }
}
