package org.la.test.code.graph.free.code.camp;

import java.util.*;

public class Dijkstra {

    public static Dictionary[] dijkstra(Graph g, Vertex startingVertex) {
        Dictionary<String, Integer> distances = new Hashtable<>();
        Dictionary<String, Vertex> previous = new Hashtable<>();
        PriorityQueue<QueueObject<Vertex>> queue = new PriorityQueue<>();
        queue.add(new QueueObject<>(startingVertex, 0));
        for (Vertex v: g.getVertices()) {
            if (!v.equals(startingVertex)) {
                distances.put(v.getData(), Integer.MAX_VALUE);
            }
            previous.put(v.getData(), new Vertex("Null"));
        }
        distances.put(startingVertex.getData(), 0);
        while (!queue.isEmpty()) {
            Vertex current = queue.poll().data;
            for (Edge e: current.getEdges()) {
                Integer alternative = distances.get(current.getData()) + e.getWeight();
                String neighborValue = e.getEnd().getData();
                if (alternative < distances.get(neighborValue)) {
                    distances.put(neighborValue, alternative);
                    previous.put(neighborValue, current);
                    queue.add(new QueueObject<Vertex>(e.getEnd(), distances.get(neighborValue)));
                }
            }
        }
        return new Dictionary[] {distances, previous};
    }

    public static void shortestPathBetween(Graph g, Vertex startingVertex, Vertex targetVertex) {
        Dictionary[] dijkstraDictionaries = dijkstra(g, startingVertex);
        Dictionary distances = dijkstraDictionaries[0];
        Dictionary previous = dijkstraDictionaries[1];
        Integer disctance = (Integer) distances.get(targetVertex.getData());
        System.out.println("Shortest path between " + startingVertex.getData() + " and " + targetVertex.getData());
        System.out.println(disctance);
        List<Vertex> path = new ArrayList<>();
        Vertex v = targetVertex;
        while (v.getData()!="Null") {
            path.add(0, v);
            v = (Vertex) previous.get(v.getData());
        }
        System.out.println("Shortest path");
        for (Vertex pathVertex: path) {
            System.out.println(pathVertex.getData());
        }
    }

    public static void dijkstraResultPrinter(Dictionary[] d) {
        System.out.println("Distance: \n");
        for (Enumeration keys = d[0].keys(); keys.hasMoreElements(); ) {
            String nextKey = keys.nextElement().toString();
            System.out.println(nextKey + ": " + d[0].get(nextKey));
        }
        System.out.println("\nPrevious: \n");
        for (Enumeration keys = d[1].keys(); keys.hasMoreElements(); ) {
            String nextKey = keys.nextElement().toString();
            Vertex nextVertex = (Vertex) d[1].get(nextKey);
            System.out.println(nextKey + ": " + nextVertex.getData());
        }
    }
}
