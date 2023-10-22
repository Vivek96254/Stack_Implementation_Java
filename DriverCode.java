//package dscodes.basicds;
//
//public class DriverCode {
//    public static void main(String[] args) {
//        // Create a new character stack
//        CharacterStackADT stack = new ArrayCharacterStack();
//
//        // Push characters onto the stack
//        stack.push('A');
//        stack.push('B');
//        stack.push('C');
//        stack.push('D');
//
//        // Print the size of the stack
//        System.out.println("Stack size: " + stack.size());
//
//        // Peek at the top character
//        System.out.println("Peek: " + stack.peek());
//
//        // Pop characters from the stack
//        System.out.println("Pop: " + stack.pop());
//        System.out.println("Pop: " + stack.pop());
//
//        // Check if the stack is empty
//        System.out.println("Is empty? " + stack.isEmpty());
//
//        // Pop the last character
//        System.out.println("Pop: " + stack.pop());
//
//        // Check if the stack is empty again
//        System.out.println("Is empty? " + stack.isEmpty());
//
//        // Check
//    }
//}
package dscodes.basicds;

public class DriverCode { // DriverCode = this will drive/run my code
    public static void main(String[] args){
        CharacterStackADT stack1 = new ArrayCharacterStack();

        System.out.println("Initial Stack:\n" + stack1);
        stack1.push('a');
        System.out.println(stack1);
        stack1.push('b');
        System.out.println(stack1);
        stack1.push('c');
        System.out.println(stack1);
        stack1.push('d');
        System.out.println(stack1);
        stack1.push('e');
        System.out.println(stack1);
        stack1.push('f');
        System.out.println(stack1);
        stack1.push('g');
        System.out.println(stack1);
        stack1.push('h');
        System.out.println(stack1);
        stack1.push('i');
        System.out.println(stack1);
        stack1.push('j');

        System.out.println(stack1 + "\n\n\n\n\n\n"); // Overflow
        char popped = stack1.pop();
        System.out.println(stack1 + "\t POPPED ELEMENT : " + popped);
        popped = stack1.pop();
        System.out.println(stack1 + "\t POPPED ELEMENT : " + popped);
        popped = stack1.pop();
        System.out.println(stack1 + "\t POPPED ELEMENT : " + popped);
        popped = stack1.pop();
        System.out.println(stack1 + "\t POPPED ELEMENT : " + popped);
        popped = stack1.pop();
        System.out.println(stack1 + "\t POPPED ELEMENT : " + popped);
        popped = stack1.pop();
        System.out.println(stack1 + "\t POPPED ELEMENT : " + popped);
        popped = stack1.pop();
        System.out.println(stack1 + "\t POPPED ELEMENT : " + popped);
        popped = stack1.pop();
        System.out.println(stack1 + "\t POPPED ELEMENT : " + popped);
        popped = stack1.pop();
        System.out.println(stack1 + "\t POPPED ELEMENT : " + popped);
        popped = stack1.pop();
        System.out.println(stack1 + "\t POPPED ELEMENT : " + popped);


    }
}
