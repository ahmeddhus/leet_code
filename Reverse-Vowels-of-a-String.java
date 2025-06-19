class Solution {
    public String reverseVowels(String s) {
        int l1 = 0;
        int l2 = s.length() - 1;
        StringBuilder output = new StringBuilder();
        output.append(s);

        while (l1 < l2) {

            char c1 = s.charAt(l1);
            char c2 = s.charAt(l2);

            if (isCharacterVowel(c1) && isCharacterVowel(c2)) {
                output.setCharAt(l1, c2);
                output.setCharAt(l2, c1);
                l1++;
                l2--;

            } else {
                if (!isCharacterVowel(c1)) {
                    l1++;
                }
                if (!isCharacterVowel(c2)) {
                    l2--;
                }

            }
        }

        return output.toString();
    }

    private boolean isCharacterVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

}