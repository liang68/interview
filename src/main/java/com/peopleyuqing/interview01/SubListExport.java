package com.peopleyuqing.interview01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 输入一个集合，输出这个集合的所有子集
 * @author liangyongxing
 * @createTime 2017-02-06
 */
public class SubListExport {
	public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("请输入一串整数并在输入时用英文逗号隔开：");
        String inputString = new Scanner(System.in).next().toString();
        if (inputString != null && !inputString.isEmpty()) {
            String[] strArray = inputString.split(",");
            for (String str : strArray) {
                list.add(Integer.parseInt(str));
            }
            HashSet<ArrayList<Integer>> allsubsets = getSubsets(list);
            for(ArrayList<Integer> subList : allsubsets) {
                System.out.println(subList);
            }
        }
    }

    public static HashSet<ArrayList<Integer>> getSubsets(ArrayList<Integer> subList) {
        HashSet<ArrayList<Integer>> allsubsets = new HashSet<ArrayList<Integer>>();
        int max = 1 << subList.size();
        for(int loop = 0; loop < max; loop++) {
            int index = 0;
            int temp = loop;
            ArrayList<Integer> currentCharList = new ArrayList<Integer>();
            while(temp > 0) {
                if((temp & 1) > 0) {
                	currentCharList.add(subList.get(index));
                }
                temp>>=1;
                index++;
            }
            allsubsets.add(currentCharList);
        }
        return allsubsets;
    }
}