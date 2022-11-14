import java.util.HashMap;

public class TwoSumWithHashMap {
    static int[] TwoSum(int[] arr,int target){
        int [] result = new int[]{-1,-1};
        HashMap <Integer,Integer> hm = new HashMap<Integer,Integer>();

        for(int i = 0;i<arr.length;i++){
            int complement = target - arr[i];
            if(hm.containsKey(complement)){
                result[0] = i;
                result[1] = hm.get(complement);
                return result;
            }
            else{
                hm.put(arr[i],i);
            } 
        }
        return result;
    }
    
    public static void main(String[]args){
        int target = 19;
        int [] input = new int[]{1,2,3,4,5,6,7,8,9,10};
        int [] output = TwoSum(input,target);
        
        for(int a:output){
            System.out.print(a+" ");
        }
    }
}
