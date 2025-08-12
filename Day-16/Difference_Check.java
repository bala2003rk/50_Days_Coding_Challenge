class Solution {
    public static int seconds(String time){
        String[] s=time.split(":");
        
        int h=Integer.parseInt(s[0]);
        int m=Integer.parseInt(s[1]);
        int sec=Integer.parseInt(s[2]);
        
        return h*3600+m*60+sec;
    }
    public int minDifference(String[] arr) {
        // code here
        int n=arr.length;
        int[] second=new int[n];
        
        for(int i=0;i<n;i++){
            second[i]=seconds(arr[i]);
        }
        
        Arrays.sort(second);
        
        int mindiff=Integer.MAX_VALUE;
        
        for(int i=1;i<n;i++){
            int curr=second[i]-second[i-1];
            mindiff=Math.min(mindiff,curr);
        }
        
        int wrap=86400-second[n-1]+second[0];
        mindiff=Math.min(mindiff,wrap);
        return mindiff;
    }
}
