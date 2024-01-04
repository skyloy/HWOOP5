package org.example;

import java.util.*;

public class ValueFinder {

    // 1 метод
    public List<String> values = new LinkedList<>();
    public String value;
    public String getValue() {
        return value;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static boolean contains(List<String> values, String value) {
        for (String v : values) {
            if (Objects.equals(value, v)) {
                return true;
            }
        }
        return false;
    }

}
