package linkedlists;

/**
 *
 * @author rmarshall
 */
public class LinkedLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        int N = 9;
        int M = 5;

        Node t = new Node(1);
        t.setKey(1);
        Node x = t;

        System.out.println("t key = " + t.getKey());
        System.out.println("x key = " + x.getKey());

        for (i = 2; i <= N; i++) {

            t.setNext(new Node(i));
            System.out.println("t = " + t.getKey());
            System.out.println("t->next = " + t.getNext());
            t = t.getNext();
            System.out.println("t is now t->next : t = " + t.getKey());
        }
        t.setNext(x);
        System.out.println("x = " + x.getKey());
        System.out.println(" t = " + t + " t->next = " + t.getNext());
        while (t != t.getNext()) {
            for (i = 1; i < M; i++) {
                t = t.getNext();
            }
            System.out.println(t.getNext().getKey());
            x = t.getNext();
            t.setNext(x.getNext());
            System.out.println("delete: " + x);
        }
        System.out.println( "Last man standing : " + t.getKey() );
    }
}
