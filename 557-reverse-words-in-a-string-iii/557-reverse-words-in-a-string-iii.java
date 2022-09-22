class Solution {
    public String reverseWords(String s) {
      if(s == null || s .length() == 0) 
        return s;

      StringBuilder reversedWordSP = new StringBuilder();
      String[] splittedWords = s.split(" ");

      for(String word: splittedWords){
        StringBuilder wordSp = new StringBuilder();
        wordSp.append(word);
        wordSp.reverse();
        reversedWordSP.append(wordSp.toString()+ " ");
      }


        return reversedWordSP.toString().trim();
    }
}