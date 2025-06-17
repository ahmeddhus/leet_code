class Solution {
    public String mergeAlternately(String word1, String word2) {
        int word1Length = word1.length();
        int word2Length = word2.length();
        StringBuilder output = new StringBuilder(word1Length + word2Length);

        int i = 0;
        while (word1Length > i && word2Length > i) {
            output.append(word1.charAt(i));
            output.append(word2.charAt(i));
            i++;
        }

        if (word1Length > i) {
            output.append(word1, i, word1Length);
        } else if (word2Length > i) {
            output.append(word2, i, word2Length);

        }

        return output.toString();
    }
}
