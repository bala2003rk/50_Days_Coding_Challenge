class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();

        for (String str : operations) {
            if (str.equals("+")) {
                int top = s.pop();
                int secondTop = s.peek();
                s.push(top);                    
                s.push(top + secondTop);       
            } else if (str.equals("D")) {
                s.push(s.peek() * 2);
            } else if (str.equals("C")) {
                s.pop();
            } else {
                s.push(Integer.parseInt(str));
            }
        }

        int sum = 0;
        for (int score : s) {
            sum += score;
        }

        return sum;
    }
}
