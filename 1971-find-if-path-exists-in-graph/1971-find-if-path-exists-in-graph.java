class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        if (source == destination) return true;
        
        HashMap<Integer, List<Integer>> nodeMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            nodeMap.put(i, new ArrayList<>());
        }

        // Populate adjacency list
        for (int[] edge : edges) {
            nodeMap.get(edge[0]).add(edge[1]);
            nodeMap.get(edge[1]).add(edge[0]);
        }

        System.out.println("nodeMap => " + nodeMap);

        boolean[] visited = new boolean[n];
        final Queue<Integer> queue = new LinkedList<>();

        visited[source] = true;
        queue.add(source);

        while (!queue.isEmpty()) {
            final int vertex = queue.poll();

            for (int adjVertex : nodeMap.get(vertex)) {
                if (adjVertex == destination) {
                    return true;
                }
                if (!visited[adjVertex]) {
                    visited[adjVertex] = true;
                    queue.add(adjVertex);
                }
            }
        }

        return false;
    }
}