package com.collections.lists.doubleList;

import java.util.ArrayList;

public class DoubleList {
    public static void doubleList(ArrayList<String> list) {
        ArrayList<String> doubledList = new ArrayList<>();

        for (String str : list) {
            doubledList.add(str);
            doubledList.add(str);
        }

        list.clear();
        list.addAll(doubledList);
    }
}

