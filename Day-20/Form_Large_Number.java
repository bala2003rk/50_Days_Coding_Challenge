import java.util.*;
class Solution {
    public String findLargest(int[] arr) {
        // code here
        String[] strNums = Arrays.stream(arr).mapToObj(String::valueOf)
        .toArray(String[]::new);
        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));
        if (strNums[0].equals("0")) {
            return "0";
        }

        return String.join("", strNums);
    }
}