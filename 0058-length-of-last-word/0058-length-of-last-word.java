class Solution {
    public int lengthOfLastWord(String s) {
        String[] strsArr = s.split(" ");

        int lastIndex = strsArr.length -1;

        while(lastIndex >= 0){
            if(!strsArr[lastIndex].isEmpty()){
                return strsArr[lastIndex].length();
            }else{
                lastIndex--;
            }
        }

        return 0;  
    }
}