class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String word1Str = "";
        String word2Str = "";

        for (int i = 0; i < word1.length || i < word2.length; i++) {
            if (i < word1.length)
                word1Str += word1[i];
            if (i < word2.length)
                word2Str += word2[i];
        }


        return word1Str.equals(word2Str);
    }
}