public class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!areConcatEqual(str1, str2)) {
            return "";
        }

        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

        private boolean areConcatEqual(String a, String b) {
        StringBuilder sb1 = new StringBuilder(a.length() + b.length());
        sb1.append(a).append(b);

        StringBuilder sb2 = new StringBuilder(a.length() + b.length());
        sb2.append(b).append(a);

        return sb1.toString().equals(sb2.toString());
    }


    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
