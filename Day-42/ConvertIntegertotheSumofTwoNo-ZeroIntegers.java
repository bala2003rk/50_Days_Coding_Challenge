class Solution {
    private static boolean containsZero(int n){
        while(n > 0){
            if(n % 10 == 0) return true;
            n /= 10;
        }
        return false;
    }
    public int[] getNoZeroIntegers(int n) {
        if(n <= 1){
            return new int[]{0,0};
        }
        for(int a = 1; a < n ; a++){
            int b = n - a;
            if(!containsZero(a) && !containsZero(b)){
                return new int[]{a,b};
            }
        }
        return new int[]{0,0};
    }
}