class Solution {
    int getLPSLength(String s) {
        // code here
        int n=s.length();
        int i,j;
        int[] lps=new int[n];
        lps[0]=0;
        for( i=1, j=0;i<n;){
            if(s.charAt(i)==s.charAt(j)){
                lps[i]=j+1;
                i++;
                j++;
            }
            else{
                if(j==0){
                    lps[i]=0;
                    i++;
                }
                else{
                    j=lps[j-1];
                }
            }
        }
        return lps[n-1];
    }
}