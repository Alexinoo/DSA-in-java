package Stack;

public class Pop {

    public static void main(String[] args){
        Stack myStack = new Stack(7);
        myStack.push(23);
        myStack.push(3);
        myStack.push(11);

        System.out.println("Before popping");
        myStack.printStack(); //11 3 23 7


        //Pop() in action
        myStack.pop();


        System.out.println("After popping");
        myStack.printStack(); // 3 23 7
    }
}
