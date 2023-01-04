class Solution {
    public int minDeletionSize(String[] strs) {
        int dels = 0;

        for(int col=0; col<strs[0].length(); col++){
            char prev = '0';
            for(String str : strs){
                char cur = str.charAt(col);
                if(cur < prev){
                    dels++;
                    break;
                }
                prev = cur;
            }
        }
        return dels;
    }
}