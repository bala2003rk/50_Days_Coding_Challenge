import java.util.*;
class Solution {
    public int minSoldiers(int[] arr, int k) {
        int n = arr.length;
        int count = 0;
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] % k == 0) {
                count++; 
            } else {
                res.add(k - arr[i] % k); 
            }
        }

        int requiredLucky = (n + 1) / 2; 
        if (count >= requiredLucky) {
            return 0;
        }

        int rem = requiredLucky - count;
        Collections.sort(res); 
        int result = 0;

        for (int j = 0; j < rem; j++) {
            result += res.get(j); 
        }

        return result;
    }
}