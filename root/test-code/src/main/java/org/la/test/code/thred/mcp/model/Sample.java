package org.la.test.code.thred.mcp.model;

public class Sample {

    private String tag;
    private double[] example;

    public Sample() {}

    public Sample(String tag, double[] example) {
        this.tag = tag;
        this.example = example;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public double[] getExample() {
        return example;
    }

    public void setExample(double[] example) {
        this.example = example;
    }
}
