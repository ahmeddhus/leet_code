class Solution {
    public boolean halvesAreAlike(String s) {
        HashSet<Character> setVowels = new HashSet<>();
        setVowels.add('a');
        setVowels.add('A');
        setVowels.add('e');
        setVowels.add('E');
        setVowels.add('i');
        setVowels.add('I');
        setVowels.add('o');
        setVowels.add('O');
        setVowels.add('u');
        setVowels.add('U');

        final int mid = s.length() / 2;
        String a = s.substring(0, mid);
        String b = s.substring(mid);

        int aNum = 0;
        int bNum = 0;

        for (int i = 0; i < a.length(); i++) {
            if (setVowels.contains(a.charAt(i))) {
                aNum++;
            }
            if (setVowels.contains(b.charAt(i))) {
                bNum++;
            }
        }

        return aNum == bNum;
    }
}