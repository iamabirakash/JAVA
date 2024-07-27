// import java.lang.reflect.Method;
import java.util.ArrayList;

public class ffirstgraph {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 2));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }

    public static void main(String[] args) {
        int V = 4;

        // Initialize the array of ArrayLists
        ArrayList<Edge>[] graph = new ArrayList[V];
        // ArrayList<Edge> graph[] = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // Create the graph
        createGraph(graph);

        // Print 2's neighbours
        System.out.print("Neighbours of vertex 2: ");
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.print(e.dest + " ");
        }
    }
}
