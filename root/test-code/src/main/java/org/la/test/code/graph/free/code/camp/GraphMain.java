package org.la.test.code.graph.free.code.camp;

public class GraphMain {

    public static void main(String[] args) {
        Graph busNetwork = new Graph(true, false);
        Vertex cliftonStation = busNetwork.addVertex("Clifton");
        Vertex capMayStation = busNetwork.addVertex("Cap May");
        busNetwork.addEdge(cliftonStation, capMayStation, 100);
        busNetwork.print();
//        capMayStation.print(true);
    }
}
