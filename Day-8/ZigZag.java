class Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[Math.min(numRows, s.length())];
        for (int i = 0; i < rows.length; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);
            // Change direction if we hit the top or bottom
            if (currentRow == 0) {
                goingDown = true;
            } else if (currentRow == numRows - 1) {
                goingDown = false;
            }
            // Move up or down
            currentRow += goingDown ? 1 : -1;
        }

        // Build the result from the rows
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}