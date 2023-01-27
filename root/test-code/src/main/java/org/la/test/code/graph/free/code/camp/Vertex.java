package org.la.test.code.graph.free.code.camp;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Vertex {

    private String data;
    private List<Edge> edges;

    public Vertex(String data) {
        this.data = data;
        edges = new ArrayList<>();
    }

    public void addEdge(Vertex endVertex, Integer weight) {
        edges.add(new Edge(this, endVertex, weight));
    }

    public void removeEdge(Vertex endVertex) {
        edges.removeIf(edge -> edge.getEnd().equals(endVertex));
    }

    public void print(boolean showWeight) {
        if (edges.isEmpty()) {
            System.out.println(this.data + " -->");
            return;
        }
        StringBuilder sb = new StringBuilder();
        int size = edges.size();
        for (int i=0; i<size; i++) {
            if (i==0) {
                sb.append(edges.get(0).getStart().data).append(" --> ");
            }
            sb.append(edges.get(i).getEnd().data);
            if (showWeight) {
                sb.append(" (").append(edges.get(i).getWeight()).append(")");
            }
            if (i!=edges.size()-1) {
                sb.append(", ");
            }
        }
        System.out.println(sb.toString());
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex vertex = (Vertex) o;
        return Objects.equals(data, vertex.data) &&
                Objects.equals(edges, vertex.edges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, edges);
    }
}
