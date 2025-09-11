import java.util.ArrayList;
import java.util.Collections;

class Solution {
    private static boolean isVowel(char ch) {
        return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public String sortVowels(String s) {
        ArrayList<Character> ans = new ArrayList<>();
        for (int k = 0; k < s.length(); k++) {
            if (isVowel(s.charAt(k))) {
                ans.add(s.charAt(k));
            }
        }
        Collections.sort(ans);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            if (isVowel(s.charAt(j))) {
                sb.append(ans.get(i));
                i++;
            } else {
                sb.append(s.charAt(j));
            }
        }
        return sb.toString();
    }
}