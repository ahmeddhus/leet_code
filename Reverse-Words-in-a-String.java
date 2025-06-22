class Solution {
    public String reverseWords(String s) {
         StringBuilder output = new StringBuilder();
        String[] strList = s.split(" ");

        for (int i = strList.length - 1; i >= 0; i--) {
            if (!strList[i].isEmpty()) {
                output.append(strList[i] + " ");
            }
        }

        return output.toString().trim();
    }
}