class Solution {
    public int romanToDecimal(String s) {
        // code here
        int result = 0;
        int length = s.length();

        Map<Character, Integer> h1 = new HashMap<>();
        h1.put('I', 1);
        h1.put('V', 5);
        h1.put('X', 10);
        h1.put('L', 50);
        h1.put('C', 100);
        h1.put('D', 500);
        h1.put('M', 1000);

        int i;
        for(i = 0; i<length-1; i++){
           
            if(h1.get(s.charAt(i+1))>h1.get(s.charAt(i))){
                result -= h1.get(s.charAt(i));
                continue;
            }
            result += h1.get(s.charAt(i));
        }
        result += h1.get(s.charAt(i));
        return result;
    }
}