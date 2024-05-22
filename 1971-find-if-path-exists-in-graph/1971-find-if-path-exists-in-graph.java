class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) return true; // Quick check if source and destination are the same

        // Create adjacency list
        List<List<Integer>> adjList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        // Populate adjacency list
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]); // Since the graph is undirected
        }

        // BFS initialization
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();

        visited[source] = true;
        queue.add(source);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();

            for (int adjVertex : adjList.get(vertex)) {
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