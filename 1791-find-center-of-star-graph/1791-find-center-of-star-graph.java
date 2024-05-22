import java.util.Set;
import java.util.HashSet;

class Solution {
    public int findCenter(int[][] edges) {
        int node1 = edges[0][0];
        int node2= edges[0][1];
            
       if(node1 == edges[1][0] || node1 == edges[1][1])
           return node1;
        else if(node2 == edges[1][0] || node2 == edges[1][1])
            return node2;
        else             
            return -1;
    }
}