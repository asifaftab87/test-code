package org.la.test.code.graph.free.code.camp;

import java.util.List;

public class GraphTraverser {

    public static void depthFirstTraversal(Vertex start, List<Vertex> visitedVertices) {
        System.out.println(start.getData());
        for (Edge e : start.getEdges()) {
            Vertex neighbor = e.getEnd();
            if (!visitedVertices.contains(neighbor)) {
                visitedVertices.add(neighbor);
                depthFirstTraversal(neighbor, visitedVertices);
            }
        }
    }

    public static void breadthFirstSearch(Vertex start, List<Vertex> visitedVertices) throws Exception {
        Queue<Vertex> visitQueue = new Queue<>();
        visitQueue.enqueue(start);
        while (!visitQueue.isEmpty()) {
            Vertex current = visitQueue.dequeue();
            System.out.println(current.getData());
            for (Edge e : current.getEdges()) {
                Vertex neighbor = e.getEnd();
                if (!visitedVertices.contains(neighbor)) {
                    visitedVertices.add(neighbor);
                    visitQueue.enqueue(neighbor);
                }
            }
        }
    }
}
