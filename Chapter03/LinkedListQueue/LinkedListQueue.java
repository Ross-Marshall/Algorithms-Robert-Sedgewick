public class LinkedListQueue {

    private Node queue;
    private Node head;
    private Node tail;
    private int size = 0;

    public LinkedListQueue() {
    
         head = new Node();
         tail = new Node();
         head.next = tail;
         tail.next = tail;
    }

    public void put( int value ) {
       Node t = new Node();
       t.key = value;
       t.next = head.next; 
       head.next = t; 
       size++;     
    }

    public long get() {
       Node t = head.next;
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
        Node i = head;
        int counter = 0;
        while ( i.next != tail   ) {
            i = i.next;
            System.out.println( counter++ + ". value [" + i.key + "]" );           
        }
    }

    public static void main ( String [] args ) {
       
        LinkedListQueue queue = new LinkedListQueue();

        queue.put( 10 );
        queue.put( 20 );
        queue.put( 30 );
        queue.printQueue();

        queue.put( 11 );
        queue.put( 21 );
        queue.put( 31 );
        queue.printQueue();

        queue.get();
        queue.printQueue();

        queue.get();
        queue.printQueue();

        queue.get();
        queue.printQueue();

        queue.get();
        queue.printQueue();

        queue.put(50);
        queue.printQueue();

        queue.put(60);
        queue.printQueue();

        queue.get();
        queue.printQueue();

    }
}
