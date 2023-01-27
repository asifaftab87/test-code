package org.la.test.code.graph.free.code.camp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Graph {

    private List<Vertex> vertices;
    private boolean isWeight, isDirected;

    public Graph(boolean isWeight, boolean isDirected) {
        this.vertices = new ArrayList<>();
        this.isWeight = isWeight;
        this.isDirected = isDirected;
    }

    public Vertex addVertex(String data) {
        Vertex vertex = new Vertex(data);
        vertices.add(vertex);
        return vertex;
    }

    public void addEdge(Vertex v1, Vertex v2, Integer weight) {
        if (!this.isWeight) {
            weight = null;
        }
        v1.addEdge(v2, weight);
        if (!this.isDirected) {
            v2.addEdge(v1, weight);
        }
    }

    public void removeEdge(Vertex v1, Vertex v2) {
        v1.removeEdge(v2);
        if (!isDirected) {
            v2.removeEdge(v1);
        }
    }

    public void removeVertex(Vertex v) {
        vertices.remove(v);
    }

    public Optional<Vertex> getVertexByValue(String value) {
        return vertices.stream().filter(vertex -> vertex.getData().equals(value)).findFirst();
    }

    public void print() {
        vertices.forEach(v -> v.print(isWeight));
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertex> vertices) {
        this.vertices = vertices;
    }

    public boolean isWeight() {
        return isWeight;
    }

    public void setWeight(boolean weight) {
        isWeight = weight;
    }

    public boolean isDirected() {
        return isDirected;
    }

    public void setDirected(boolean directed) {
        isDirected = directed;
    }
}
