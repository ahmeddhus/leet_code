class Solution {
    public boolean isPalindrome(int x) {
        if(x < 10 && x >= 0){
          return true;
        }
        if(x < 0){
          return false;
        }
        else if(x > 9 && x < 100){
          String[] numbersList = (x+"").split("");
          if(!numbersList[0].equals(numbersList[1])) return false;
          else return true;
        }else{
          String[] numbersList = (x+"").split("");
          int lastIndex = numbersList.length - 1;
          for(int i = 0 ; i<numbersList.length/2; i++){
            if(!numbersList[i].equals(numbersList[lastIndex-i])){
              return false;
            }
          }

          return true;
        }
    }
}