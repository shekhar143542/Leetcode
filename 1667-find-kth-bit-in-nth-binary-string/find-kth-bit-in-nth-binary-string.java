class Solution {
    public char findKthBit(int n, int k) {
        String prev = "0";

        for (int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();

            sb.append(prev);
            sb.append("1");

            String invertedReversed = invertAndReverse(prev);
            sb.append(invertedReversed);

            prev = sb.toString();
        }

        return prev.charAt(k - 1);
    }

    private String invertAndReverse(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            sb.append(c == '0' ? '1' : '0');
        }

        return sb.toString();
    }
}