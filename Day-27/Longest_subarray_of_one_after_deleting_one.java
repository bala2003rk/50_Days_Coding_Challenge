class Solution {
    public int longestSubarray(int[] nums) {
        int zero=0,window=0,start=0,end=nums.length-1;
        for(int i=0;i<=end;i++){
            if(nums[i]==0){
                zero++;
            }
            while(zero>1){
                zero-=(nums[start]==0 ? 1 : 0);
                start++;
            }
            window=Math.max(window,i-start);
        }
        return window;
    }
}