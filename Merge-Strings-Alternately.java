class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        StringBuilder output = new StringBuilder(len1 + len2);

        int i = 0, j = 0;
        while (i < len1 && j < len2) {
            output.append(word1.charAt(i++));
            output.append(word2.charAt(j++));
        }
        // Append the remaining part of the longer string
        if (i < len1) output.append(word1.substring(i));
        if (j < len2) output.append(word2.substring(j));

        return output.toString();
    }
}
