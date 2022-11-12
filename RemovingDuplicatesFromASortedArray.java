import java.util.Scanner;
import java.util.LinkedList;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream; 

class RemovingDuplicatesFromASortedArray{
    public static int[] removeElement(int []nums, int index){
        if (nums == null || index < 0 || index > nums.length) { 
            System.out.println("non-existing index");
            return nums; 
        } 
        //array to arrayList
        ArrayList <Integer> a1 = new ArrayList<Integer>();
        a1 = (ArrayList<Integer>) IntStream.of(nums).boxed().collect(Collectors.toList()); 
        // Remove the specified element 
        a1.remove(index); 
     
        // return the resultant array 
        return a1.stream().mapToInt(Integer::intValue).toArray();
    }

    public int removeDuplicates(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == nums[i+1]){
                removeElement(nums,i+1);
                i = i-1;
            }
        }

        return nums.length;
    }


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
    }
}

    