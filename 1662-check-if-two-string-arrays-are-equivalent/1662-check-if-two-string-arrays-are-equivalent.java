class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder word1Str = new StringBuilder();
        StringBuilder word2Str = new StringBuilder();

        for (int i = 0; i < word1.length || i < word2.length; i++) {
            if (i < word1.length)
                word1Str.append(word1[i]);
            if (i < word2.length)
                word2Str.append(word2[i]);
        }

        return word1Str.toString().equals(word2Str.toString());
    }
}