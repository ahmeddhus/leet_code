class Solution {
    public int concatenatedBinary(int n) {
      int M = 1000000007;
      long ans = 0;
      int size = 0;
      for (int i=1; i<=n; i++)
      {
          if ((i&(i-1)) == 0) size++;
          ans = ((ans << size) | i)%M;
      }
      return (int)ans;
    }
}