import java.util.LinkedList;
import java.util.function.Predicate;

public class Removeif {
    public static void main(String []args){
        LinkedList <Integer> a1 = new LinkedList<Integer>();

        for(int i =1; i<=20;i++){
            a1.add(i);
        }

        Predicate <Integer> p1 = a->(a%5 != 0);

        for(Integer a:a1){
            System.out.print(a+" ");
        }
        System.out.println("");

        a1.removeIf(p1);
        for(Integer a:a1){
            System.out.print(a+" ");
        }
        System.out.println("");
    }
}
