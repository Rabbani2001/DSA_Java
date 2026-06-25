class Solution {
    public int[] twoSum(int[] nums, int target) {
        int m = nums.length;
        int r[]=new int[2];
        for(int i=0;i<m;i++){
            for (int j=(i+1);j<m;j++){
                if(nums[i]+nums[j]==target){
                    r[0]=i;
                    r[1]=j;
                }
            }




        }
    return r;  
    }
}