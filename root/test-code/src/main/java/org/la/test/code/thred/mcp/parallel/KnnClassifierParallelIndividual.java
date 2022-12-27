package org.la.test.code.thred.mcp.parallel;

import org.la.test.code.thred.mcp.critical.IndividualDistanceTask;
import org.la.test.code.thred.mcp.model.Distance;
import org.la.test.code.thred.mcp.model.Sample;

import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class KnnClassifierParallelIndividual {

    private List<? extends Sample> dataSet;
    private int k;
    private ThreadPoolExecutor executor;
    private int numThreads;
    private boolean parallelSort;

    public KnnClassifierParallelIndividual(List<? extends Sample>
                                                   dataSet, int k, int factor, boolean parallelSort) {
        this.dataSet = dataSet;
        this.k = k;
        numThreads = factor *
                (Runtime.getRuntime().availableProcessors());
        executor = (ThreadPoolExecutor)
                Executors.newFixedThreadPool(numThreads);
        this.parallelSort = parallelSort;
    }

    public String classify(Sample example) throws Exception {
        Distance[] distances = new Distance[dataSet.size()];
        CountDownLatch endController = new
                CountDownLatch(dataSet.size());
        int index = 0;
        for (Sample localExample : dataSet) {
            IndividualDistanceTask task = new
                    IndividualDistanceTask(distances, index, localExample,
                    example, endController);
            executor.execute(task);
            index++;
        }
        if (parallelSort) {
            Arrays.parallelSort(distances);
        } else {
            Arrays.sort(distances);
        }
        Map<String, Integer> results = new HashMap<>();
        for (int i = 0; i < k; i++) {
            Sample localExample = dataSet.get(distances[i].getIndex());
            String tag = localExample.getTag();
            results.merge(tag, 1, (a, b) -> a + b);
        }
        return Collections.max(results.entrySet(),
                Map.Entry.comparingByValue()).getKey();
    }

    public void destroy() {
        executor.shutdown();
    }
}
