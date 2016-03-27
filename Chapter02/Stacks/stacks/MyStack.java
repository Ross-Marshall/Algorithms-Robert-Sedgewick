package stacks;

/**
 *
 * @author rmarshall
 */
public class MyStack {

    public String[] myStack = new String[100];

    public int stackPointer = 0;

    public void push(String item) {
        myStack[stackPointer++] = item;
    }

    public String pop() {
        String popValue = "";

        return myStack[--stackPointer];

    }

    public void empty() {
        stackPointer = 0;
    }
}
