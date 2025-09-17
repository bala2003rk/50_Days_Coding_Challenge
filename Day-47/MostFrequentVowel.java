// class Solution {
//     public int maxFreqSum(String s) {
//         HashMap<Character, Integer> vowels = new HashMap<>();
//         HashMap<Character, Integer> consonants = new HashMap<>();
//         String vowelSet = "aeiou";
//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             if (Character.isLetter(ch)) {
//                 ch = Character.toLowerCase(ch); 
//                 if (vowelSet.indexOf(ch) != -1) {
//                     vowels.put(ch, vowels.getOrDefault(ch, 0) + 1);
//                 } else {
//                     consonants.put(ch, consonants.getOrDefault(ch, 0) + 1);
//                 }
//             }
//         }
//         int maxVowelFreq = vowels.values().stream().max(Integer::compare).orElse(0);
//         int maxConsoFreq = consonants.values().stream().max(Integer::compare).orElse(0);
//         return maxVowelFreq + maxConsoFreq;
//     }
// }
class Solution {
    public int maxFreqSum(String s) {
        s = s.toLowerCase();
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            arr[c - 'a']++;
        }
        int vmax = 0;
        int cmax = 0;
        for (int i = 0; i < arr.length; i++) {

            if ((i == 0 || i == 4 || i == 8 || i == 14 || i == 20) && arr[i] > vmax) {
                vmax = arr[i];
            } else if ((i != 0 && i != 4 && i != 8 && i != 14 && i != 20) && arr[i] > cmax) {
                cmax = arr[i];
            }
        }
        return vmax + cmax;
    }
}