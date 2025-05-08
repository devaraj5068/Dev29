public class DijkstraSimple {
    public static void dijkstra(int[][] graph, int start) {
        int n = graph.length;
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) dist[i] = Integer.MAX_VALUE;
        dist[start] = 0;

        for (int i = 0; i < n - 1; i++) {
            int u = (dist[0] < dist[1] && !visited[0]) ? 0 : 1;
            visited[u] = true;

            for (int v = 0; v < n; v++) {
                if (!visited[v] && graph[u][v] != 0 && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Distance from " + start + " to " + i + " is " + dist[i]);
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 4},
            {0, 0}
        };

        dijkstra(graph, 0); // Start from node 0
    }
}
//output:
// Distance from 0 to 0 is 0
// Distance from 0 to 1 is 4