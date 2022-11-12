import java.util.ArrayList;
import java.util.LinkedList;

public class Methods {
    public static void main(String [] args){
        LinkedList <Integer> a1 = new LinkedList<Integer>();
        LinkedList <Integer> a2 = new LinkedList<Integer>();

        ArrayList <Integer> b1 = new ArrayList<Integer>();


        a1.add(1);
        a1.add(2);

        a2.add(3);
        a2.addAll(a1);

        b1.add(3);
        b1.addAll(a1);

        
        System.out.println("The List a1");
        for(Integer a:a1){
            System.out.print(a+" ");
        }

        System.out.println("");
        System.out.println("The List a2");
        for(Integer a:b1){
            System.out.print(a+" ");
        }
    }    
}
