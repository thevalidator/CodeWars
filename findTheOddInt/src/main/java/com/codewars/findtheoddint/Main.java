/*
 * The Krechet Software
 */
package com.codewars.findtheoddint;

import java.util.HashMap;
import java.util.Map;

/**
 * @author theValidator <the.validator@yandex.ru>
 */
public class Main {

    public static void main(String[] args) {

        //System.out.println(findIt(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5}));
        System.out.println(findIt2(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5}));

    }

    public static int findIt(int[] a) {

        int odd = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                int count = map.get(a[i]);
                map.replace(a[i], count + 1);
            } else {
                map.put(a[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() % 2 != 0) {
                odd = e.getKey();
                break;
            }
        }

        return odd;
    }

    //from codewars
    public static int findIt2(int[] A) {
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            xor ^= A[i];
        }
        return xor;
    }
}
