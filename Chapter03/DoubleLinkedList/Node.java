public class Node {

    public int id;
    public int doubleId;
    public int idTimes64;
    public Node prev;
    public Node next;

    public Node ( int id ) {
        this.id = id;
        this.doubleId = id * 2;
        this.idTimes64 = id * 64;
    }

    public String toString () {
       return "Node id ["     + 
              id              +
              "] double Id [" +
              doubleId        +
              "] idTimes64 ["   +
              idTimes64         +
              "]";
    }

}