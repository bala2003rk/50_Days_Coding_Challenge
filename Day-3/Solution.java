import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        int count=0;
        int presum=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i : arr){
            presum+=i;
            if(map.containsKey(presum-k)){
                count+=map.get(presum-k);
            }
            map.put(presum,map.getOrDefault(presum,0)+1);
        }
        return count;
    }
}{

}
