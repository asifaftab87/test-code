package org.la.test.code.graph.free.code.camp;

public class DijkstraMain {

    public static void main(String[] args) {
        Graph graph = new Graph(true, true);
        Vertex a = graph.addVertex("A");
        Vertex b = graph.addVertex("B");
        Vertex c = graph.addVertex("C");
        Vertex d = graph.addVertex("D");
        Vertex e = graph.addVertex("E");
        Vertex f = graph.addVertex("F");
        Vertex g = graph.addVertex("G");
        graph.addEdge(a, c, 100);
        graph.addEdge(a, b, 3);
        graph.addEdge(a, d, 4);
        graph.addEdge(d, c, 3);
        graph.addEdge(d, e, 8);
        graph.addEdge(e, b, -2);
        graph.addEdge(e, f, 10);
        graph.addEdge(b, g, 9);
        graph.addEdge(e, g, -50);
        Dijkstra.dijkstraResultPrinter(Dijkstra.dijkstra(graph, a));
        Dijkstra.shortestPathBetween(graph, a, g);
    }
}
