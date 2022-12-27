package org.la.test.code.thred.mcp;

import org.la.test.code.thred.mcp.model.Sample;
import org.la.test.code.thred.mcp.parallel.KnnClassifierParallelIndividual;
import org.la.test.code.thred.mcp.util.Util;

public class ThreadStartMain {

    public static void main(String[] args) throws Exception {
        KnnClassifierParallelIndividual knnClassifierParallelIndividual = new KnnClassifierParallelIndividual(
                Util.listSample(), 30, 1, true);
        knnClassifierParallelIndividual.classify(new Sample("ample", Util.generateExample(4119)));
        knnClassifierParallelIndividual.destroy();
    }
}
