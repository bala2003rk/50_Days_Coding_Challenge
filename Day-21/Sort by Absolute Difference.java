import java.util.*;

class Solution {
    public void rearrange(int[] arr, int x) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        Collections.sort(list, (a, b) -> Math.abs(a - x) - Math.abs(b - x));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
    }
}
