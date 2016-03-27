
package linkedlists;

/**
 *
 * @author rmarshall
 */


public class Node {
    
      public Node ( int key ) {
          setKey( key );
      }
      
      public Node getNext() {
            return next;
        }
        
        public int getKey() {
            return key;
        }

        public void setNext(Node next) {
            this.next = next;
        }
        public int key;
        public Node next;
        
        public String toString() {
            return Integer.toString ( getKey() );
        }
        
        public void setKey( int key ) {
            this.key = key;
        }
}
