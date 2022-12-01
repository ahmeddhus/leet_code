class Solution {
    public boolean halvesAreAlike(String s) {
        String sLowerCase = s.toLowerCase();
        HashSet<Character> setVowels = new HashSet<>();
        setVowels.add('a');
        setVowels.add('e');
        setVowels.add('i');
        setVowels.add('o');
        setVowels.add('u');

        final int mid = sLowerCase.length() / 2;
        String a = sLowerCase.substring(0, mid);
        String b = sLowerCase.substring(mid);

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