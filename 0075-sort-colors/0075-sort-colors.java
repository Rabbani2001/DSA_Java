class Solution {
    public void sortColors(int[] nums) {
        int n =nums.length;
        int l =0;
        int m =0;
        int h = (n-1);
        while(m<=h){
        if(nums[m]==0){
            int o=nums[l];
            nums[l]=nums[m];
            nums[m]=o;
            m++;
            l++;
        }
        else if(nums[m]==1){
            m++;
        } 
        else{
           int p=nums[h];
            nums[h]=nums[m];
            nums[m]=p;
            h--;
        }
        }
        
    }
}