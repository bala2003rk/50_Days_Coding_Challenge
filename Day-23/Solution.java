class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long cnt = 0, concnt = 0;
        for (int num : nums) {
            concnt = (num == 0) ? concnt + 1 : 0;
            cnt += concnt;
        }
        return cnt;
    }
}