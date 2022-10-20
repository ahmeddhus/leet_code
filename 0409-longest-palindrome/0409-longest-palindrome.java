class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> hashSet = new HashSet<Character>();
        int longestPalindromeLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (hashSet.contains(s.charAt(i))) {
                longestPalindromeLength += 2;
                hashSet.remove(s.charAt(i));
            } else {
                hashSet.add(s.charAt(i));
            }
        }

        if (hashSet.size() > 0) {
            longestPalindromeLength++;
        }

        return longestPalindromeLength;
    }
}