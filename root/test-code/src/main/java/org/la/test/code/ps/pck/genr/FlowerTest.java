package org.la.test.code.ps.pck.genr;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class FlowerTest {

    @Test
    public void roseList() {
        List<Rose> rl = Arrays.asList(new Rose("Rose", "red"),
                new Rose("Rose", "white"),
                new Rose("Rose", "yellow"));
        List<Flower> roseList = new ArrayList<>();
        FlowerUtil.add(roseList, new Rose("Rose", "red"));
        FlowerUtil.add(roseList, new Rose("Rose", "white"));
        FlowerUtil.add(roseList, new Rose("Rose", "yellow"));
        assertTrue(roseList.equals(rl));
    }

    @Test
    public void roseEqualsTulip() {
        List<Flower> roseList = new ArrayList<>();
        FlowerUtil.add(roseList, new Rose("rose", "red"));
        FlowerUtil.add(roseList, new Rose("rose", "white"));
        FlowerUtil.add(roseList, new Rose("rose", "yellow"));
        List<Tulip> tl = FlowerUtil.copy(roseList, Tulip.class);
        assertTrue(roseList.equals(tl));
    }
}
