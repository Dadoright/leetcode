public class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {
        int []result = new int[2];

        for(int i=0;i<nums.length;i++){
            result[0] = i;
            for(int j=i+1;j<nums.length;j++){
                if(target == nums[i]+nums[j]){
                    result[1]=j;
                    return result;
                }
                else{
                    continue;
                }
            }
        }
        return result;
        
    }

}
