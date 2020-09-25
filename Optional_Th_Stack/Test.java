package Optional_TH_Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(5);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("1/ SIZE after push" + stack.size());
        System.out.printf("Pop element :" );
        while (!stack.isEmpty()) {
            System.out.printf("%d", stack.pop());
        }
        System.out.println("after pop" + stack.size());

    }