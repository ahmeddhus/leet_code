class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        final int mid = s.length() / 2;
        String a = s.substring(0, mid);
        String b = s.substring(mid);

        int aNum = 0;
        int bNum = 0;

        for (int i = 0; i < a.length(); i++) {
            if (vowels.contains(a.charAt(i))) {
                aNum++;
            }
            if (vowels.contains(b.charAt(i))) {
                bNum++;
            }
        }

        return aNum == bNum;
    }
}