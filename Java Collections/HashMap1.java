import java.util.HashMap;
import java.util.HashSet;


public class HashMap1 {
    public static void main(String []args){
        HashSet <Integer> hs1 = new HashSet<Integer>();
        HashSet <String> hs2 = new HashSet<String>();

        for(int i = 1; i <21;i++){
            hs1.add(i);
        }
        System.out.println(hs1);

        hs1.removeIf(Integer->Integer==12);
        System.out.println(hs1);


    }
}
