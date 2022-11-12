import java.util.Iterator;
import java.util.ArrayList;

public class Iterator1 {
    public static void main(String []args){
        ArrayList <Integer> a1 = new ArrayList<Integer>();

        for(int i=0;i<21;i++){
            a1.add(i);
        }
        
        Iterator<Integer> it = a1.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }


    }
}
