class Solution {
    private static final double EPS = 1e-6;
    private boolean helper(double[] res, int n) {
        if(n == 1) return Math.abs(res[0] - 24) < EPS;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                double a = res[i], b = res[j];
                res[j] = res[n-1];
                res[i] = a + b;

                if(helper(res, n - 1)) return true;
                res[i] = a - b;
                if(helper(res, n - 1)) return true;
                res[i] = b - a;
                if(helper(res, n - 1)) return true;
                res[i] = a * b;
                if(helper(res, n - 1)) return true;
                if(Math.abs(b) > EPS) {
                    res[i] = a / b;
                    if(helper(res, n - 1)) return true;
                }
                if(Math.abs(a) > EPS) {
                    res[i] = b / a;
                    if(helper(res, n - 1)) return true;
                }
                res[i] = a; res[j] = b;
            }
        }
        return false;
    }
    public boolean judgePoint24(int[] nums) {
        double[] res = new double[nums.length];
        for(int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
        }
        return helper(res, res.length);
    }
}