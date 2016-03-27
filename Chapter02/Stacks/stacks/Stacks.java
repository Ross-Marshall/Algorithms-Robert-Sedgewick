package stacks;

public class Stacks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyStack aStack = new MyStack();

        String data = "5 9 8 + 4 6 * * 7 + *";

        String[] tokens = data.split(" ");

        int x = 0;
        int index = 0;
        String ch;

        while (index < tokens.length) {
            System.out.println("stackPointer = " + aStack.stackPointer);
            ch = tokens[index++];
            System.out.println("ch = " + ch);
            if (ch.equals("+")) {
                x = Integer.parseInt(aStack.pop()) + Integer.parseInt(aStack.pop());
                ch = Integer.toString(x);
            } else if (ch.equals("*")) {
                x = Integer.parseInt(aStack.pop()) * Integer.parseInt(aStack.pop());
                ch = Integer.toString(x);
            } 
            aStack.push(ch);
            
        }
        System.out.println ("Result: " + aStack.pop());
    }

}