package org.la.test.code.graph.free.code.camp;


import java.util.ArrayList;
import java.util.List;

public class GraphTraverserMain {

    public static void main(String[] args) {
        TestGraph testGraph = new TestGraph();
        Vertex starting = testGraph.getStartingVertex();
        List<Vertex> visitedVertices = new ArrayList<>() ;
        visitedVertices.add(starting);
//        GraphTraverser.depthFirstTraversal(starting, visitedVertices);
        try {
            GraphTraverser.breadthFirstSearch(starting, visitedVertices);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
