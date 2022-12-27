package org.la.test.code.thred.mcp.critical;

import org.la.test.code.thred.mcp.model.Distance;
import org.la.test.code.thred.mcp.model.Sample;
import org.la.test.code.thred.mcp.util.EuclideanDistanceCalculator;

import java.util.concurrent.CountDownLatch;

public class IndividualDistanceTask implements Runnable {

    private Distance[] distances;
    private int index;
    private Sample localExample;
    private Sample example;
    private CountDownLatch endController;

    public IndividualDistanceTask(Distance[] distances, int index,
                                  Sample localExample,
                                  Sample example, CountDownLatch endController) {
        this.distances = distances;
        this.index = index;
        this.localExample = localExample;
        this.example = example;
        this.endController = endController;
    }

    public void run() {
        distances[index] = new Distance();
        distances[index].setIndex(index);
        distances[index].setDistance
                (EuclideanDistanceCalculator.calculate(localExample,
                        example));
        endController.countDown();
    }
}
