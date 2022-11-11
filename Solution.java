import java.util.*;
public class Solution {
    
        public int removeDuplicates(int[] nums) {
            List<Integer> list = Arrays.asList(nums);
            LinkedList<String> linkedList = new LinkedList<String>(list);
            for(Integer i=0;i<(linkedList.size()-1);i++){
                if(linkedList.get(i)== linkedList.get(i+1)){
                    linkedList.remove(i+1);
                    i=i-1;
                }
            };
            nums = linkedList.toArray();
            return(nums.length);
        }
}
