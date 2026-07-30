import java.util.*;
public class stackdsa {
    public static void main(String[]args){
        Stack <Integer>stack=new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.empty());
        System.out.print(stack.search(1));
    }
}
