package com.dcz.git;

import java.util.HashMap;
import java.util.Map;

public class hello {
    public static void main(String[] args) {

        HashMap<Object, Object> map = new HashMap<>();
        int a = 10 ;
        map.put(1, 2);
        map.put(2, 2);
        map.put(3, 2);
        map.put(4, 2);
        map.put(5, 2);
        System.out.println(map.get(5));
    }
}
