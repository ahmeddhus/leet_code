class Solution {
    public int romanToInt(String s) {
      if(s.length() == 1) return getIntValueFromRoman(s.toCharArray()[0]);

      int number = 0;

      for(int i =0 ; i <s.length(); i+=2){
        if(i >= s.length()-1) {
          if(i== s.length()-1){
            number += getIntValueFromRoman(s.charAt(i));
          } 
          break;
        }
        
        int firstNum = getIntValueFromRoman(s.charAt(i));
        int secondNum = getIntValueFromRoman(s.charAt(i+1));

        if(firstNum >= secondNum){
          number += firstNum;
          i--;
        }else{
          number = number+ (secondNum - firstNum);
        }
      }
      return number;
    }
    

    public int  getIntValueFromRoman(char c){
      if(c=='I') return 1;
      else if(c=='V') return 5;
      else if(c=='X') return 10;
      else if(c=='L') return 50;
      else if(c=='C') return 100;
      else if(c=='D') return 500;
      else return 1000;
  }
}