import java.util.Scanner;
import java.util.LinkedList;
import java.util.*;

class RemovingDuplicatesFromASortedArray{
    public static void removeDuplicate(LinkedList <Integer> array1){
        for(Integer i=0;i<(array1.size()-1);i++){
            if(array1.get(i)==array1.get(i+1)){
                array1.remove(i+1);
                i=i-1;
            }
        };
    }
    public static void main(String []args){
        Scanner s1 = new Scanner(System.in);
        LinkedList<Integer> a1 = new LinkedList <Integer>();

        try{
            while(true){
            
                int input1 = s1.nextInt();
                if(input1 == 0){
                    break;
                }
                a1.add(input1);
                for(Integer a2:a1){
                    System.out.print(a2 + " ");
                }
                System.out.println("");
            
            
            
            }
        }
        catch(InputMismatchException e){
            System.out.println("Input Miss Match");
        }
        finally{
            Collections.sort(a1);
            for(Integer a2:a1){
                System.out.print(a2 + " ");
            }
            System.out.println("");
            
            removeDuplicate(a1);

            for(Integer a2:a1){
                System.out.print(a2 + " ");
            }
        }

        s1.close();

        //System.out.println("Hello there");
    }
}