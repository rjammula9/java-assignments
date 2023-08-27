package com.collections.maps;
import java.util.*;

public class CityCounting {
        public static Map<String, String> cityCount(Map<String, String> inputMap) {
            Map<String, Integer> cityCounts = new HashMap<>();

            for (String city : inputMap.values()) {
                cityCounts.put(city, cityCounts.getOrDefault(city, 0) + 1);
            }

            Map<String, String> outputMap = new LinkedHashMap<>();
            for (Map.Entry<String, Integer> entry : cityCounts.entrySet()) {
                outputMap.put(entry.getKey(), entry.getValue().toString());
            }

            return outputMap;
        }

        public static void main(String[] args) {
            Map<String, String> inputMap = new HashMap<>();
            inputMap.put("John", "Dallas");
            inputMap.put("Babbar", "NewYork City");
            inputMap.put("Akbar", "Houston");
            inputMap.put("Rizwan", "Dallas");
            inputMap.put("Jorge", "Paris");
            inputMap.put("Roshan", "Dallas");
            inputMap.put("Sujit", "Houston");

            Map<String, String> outputMap = cityCount(inputMap);

            for (Map.Entry<String, String> entry : outputMap.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }


}
