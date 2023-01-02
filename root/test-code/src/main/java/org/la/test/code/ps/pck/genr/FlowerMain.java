package org.la.test.code.ps.pck.genr;

import java.util.ArrayList;
import java.util.List;

public class FlowerMain {

    public static void main(String[] args) {
        List<Flower> roseList = new ArrayList<>();
        FlowerUtil.add(roseList, new Rose("rose", "red"));
        FlowerUtil.add(roseList, new Rose("rose", "white"));
        FlowerUtil.add(roseList, new Rose("rose", "yellow"));
//        FlowerUtil.print(roseList);
        List<Tulip> tl = FlowerUtil.copy(roseList, Tulip.class);
        FlowerUtil.print(tl);
    }
}
