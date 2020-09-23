package ReseiveArray;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] array = {1, 3, 5, 2, 8, 10 ,11};

        System.out.println("Mang truoc khi dao nguoc" + array);
        for(int x : array) {
            System.out.printf("%d" ,x);
        }
        for(int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        for(int i = 0; i< array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println();
        System.out.println("mang sau khi dao nguoc" + array);
        for(int x : array) {
            System.out.printf("%d", x);
        }

    }
}
