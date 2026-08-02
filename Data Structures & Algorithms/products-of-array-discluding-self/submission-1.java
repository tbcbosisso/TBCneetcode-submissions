class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        for (int i=0;i< nums.length;i++){
            int innerprod = 1;
            int outerprod = 1;
            for (int j=0;j<i;j++){
                innerprod *= nums[j]; 
            }
            for (int j=i+1;j<nums.length;j++){
                outerprod *= nums[j]; 
            }
            output[i]= innerprod*outerprod;
        }
        return output;
    }
}  
