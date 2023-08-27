package com.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class Rarest {
    public static int rarest(Map<String, Integer> map) {
        if (map.isEmpty()) {
            throw new IllegalArgumentException("Map is empty");
        }
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int value : map.values()) {
            countMap.put(value, countMap.getOrDefault(value, 0) + 1);
        }
        int rarestValue = Integer.MAX_VALUE;
        int rarestCount = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int currentValue = entry.getKey();
            int currentCount = entry.getValue();
            if (currentCount < rarestCount || (currentCount == rarestCount && currentValue < rarestValue)) {
                rarestValue = currentValue;
                rarestCount = currentCount;
            }
        }
        return rarestValue;
    }

    public static void main(String[] args) {
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Alyssa", 22);
        ageMap.put("Char", 25);
        ageMap.put("Dan", 25);
        ageMap.put("Jeff", 20);
        ageMap.put("Kasey", 20);
        ageMap.put("Kim", 20);
        ageMap.put("Mogran", 25);
        ageMap.put("Ryan", 25);
        ageMap.put("Stef", 22);
        int rarestAge = rarest(ageMap);
        System.out.println("Rarest Ages:" + rarestAge);
    }
}

