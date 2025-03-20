import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Graph {
    private int V;
    private LinkedList<Integer>[] adj;

    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void bfs(int s) {
        boolean visited[] = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()) {
            s = queue.poll();
            System.out.print(s + " ");
            for (int n : adj[s]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}

public class dfs {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of nodes:");
        int numNodes = scanner.nextInt();
        Graph graph = new Graph(numNodes);
        
        System.out.println("Enter the number of edges:");
        int numEdges = scanner.nextInt();
        
        System.out.println("Enter edges in the format (node1 node2):");

        for (int i = 0; i < numEdges; i++) {
    int node1 = scanner.nextInt();
    int node2 = scanner.nextInt();
    if (node1 < 0 || node1 >= numNodes || node2 < 0 || node2 >= numNodes) {
        System.out.println("Invalid node indices. Please enter valid indices.");
        continue; // Skip adding this edge
    }
    graph.addEdge(node1, node2);
        }
        
        System.out.println("Enter the starting node for BFS traversal:");
        int startNode = scanner.nextInt();
        
        System.out.println("BFS for the graph is:");
        graph.bfs(startNode);
        
        scanner.close();
    }
}