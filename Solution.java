import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream; 

public class Solution {
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
}
