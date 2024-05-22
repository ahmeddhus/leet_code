import java.util.Set;
import java.util.HashSet;

class Solution {
    public int findCenter(int[][] edges) {
       if(edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1])
           return edges[0][0];
        else if(edges[0][1] == edges[1][0] || edges[0][1] == edges[1][1])
            return edges[0][1];
        else             
            return -1;
    }
}