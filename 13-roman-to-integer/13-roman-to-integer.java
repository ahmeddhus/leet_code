class Solution {
    public int romanToInt(String s) {
      if(s.length() == 1) return getRomantIntMap().get(s);

      int number = 0;

      for(int i =0 ; i <s.length(); i+=2){
        if(i >= s.length()-1) {
          if(i== s.length()-1){
            number += getRomantIntMap().get(s.charAt(i)+"");
          } 
          break;
        }
        
        int firstNum = getRomantIntMap().get(s.charAt(i)+"");
        int secondNum = getRomantIntMap().get(s.charAt(i+1)+"");

        if(firstNum >= secondNum){
          number += firstNum;
          i--;
        }else{
          number = number+ (secondNum - firstNum);
        }
      }
      return number;
    }
    
    public  HashMap<String, Integer> getRomantIntMap(){
      HashMap<String, Integer> romanIntMap = new HashMap<String, Integer>();

      romanIntMap.put("I", 1);
      romanIntMap.put("V", 5);
      romanIntMap.put("X", 10);
      romanIntMap.put("L", 50);
      romanIntMap.put("C", 100);
      romanIntMap.put("D", 500);
      romanIntMap.put("M", 1000);

      return romanIntMap;
    }
}