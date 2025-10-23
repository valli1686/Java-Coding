class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        String[][] matrix = new String[numRows][s.length()];
        int n = s.length();
        int i = 0, j = 0, k = 0;
        boolean down = true;

        while (k < n) {
            matrix[i][j] = String.valueOf(s.charAt(k++));

            if (down) {
                if (i == numRows - 1) {
                    down = false;
                    i--;
                    j++;
                } else {
                    i++;
                }
            } else {
                if (i == 0) {
                    down = true;
                    i++;
                } else {
                    i--;
                    j++;
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (i = 0; i < numRows; i++) {
            for (j = 0; j < s.length(); j++) {
                if (matrix[i][j] != null) {
                    result.append(matrix[i][j]);
                }
            }
        }

        return result.toString();
    }
}