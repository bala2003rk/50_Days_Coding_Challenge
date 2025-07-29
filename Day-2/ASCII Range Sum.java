import java.util.*;
class Solution {
    public ArrayList<Integer> asciirange(String s) {
        // code here
        Map<Character,int[]> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,new int[]{i,i});
            }
            else{
                map.get(ch)[1] = i;
            }
        }
        
        for(Map.Entry<Character,int[]> e:map.entrySet()){
            int st=e.getValue()[0];
            int end=e.getValue()[1];
            
            if(st!=end){
                int sum=0;
                for(int i=st+1;i<end;i++){
                    sum+=(int)s.charAt(i);
                }
                if(sum!=0){
                 list.add(sum);
                }
            }
        }
        return list;
    }
}