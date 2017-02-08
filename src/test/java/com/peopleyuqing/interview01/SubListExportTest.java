package com.peopleyuqing.interview01;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by liangyongxing on 2017/2/8.
 */
public class SubListExportTest {
    @Test
    public void testNormal() {
        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(1);normalList.add(2);normalList.add(3);
        HashSet<ArrayList<Integer>> sets = SubListExport.getSubsets(normalList);
        System.out.println(sets);
        Assert.assertEquals(1 << normalList.size(), sets.size());
    }

    @Test
    public void testRepeatOne() {
        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(1);normalList.add(1);normalList.add(2);
        HashSet<ArrayList<Integer>> sets = SubListExport.getSubsets(normalList);
        System.out.println(sets);
        Assert.assertEquals((1 << normalList.size()) - 2, sets.size());
    }

    @Test
    public void testRepeatAll() {
        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(1);normalList.add(1);normalList.add(1);
        HashSet<ArrayList<Integer>> sets = SubListExport.getSubsets(normalList);
        System.out.println(sets);
        Assert.assertEquals((1 << normalList.size()) - 2 * 2, sets.size());
    }
}
