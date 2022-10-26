class Solution {
    public int fib(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
       
        int prevNumber = 0;
        int currentNumber = 1;
        
        int sum = prevNumber + currentNumber;
        
        while(n > 1){
            sum = prevNumber + currentNumber;
    
            prevNumber = currentNumber;
            currentNumber = sum;
            
            n--;
        }
        
        return sum;
    }
}