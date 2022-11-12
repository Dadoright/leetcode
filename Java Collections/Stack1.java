import java.util.Stack;

public class Stack1 {

    public static void main(String []args){
        Stack<Integer> s1 = new Stack<Integer>();
        for(int i =1;i<21;i++){
            s1.add(i);
        }
        s1.pop();

        System.out.println(s1);
        

    }
}
