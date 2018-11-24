package com.study.java;

import javax.swing.text.html.parser.Entity;
import java.util.*;

/**
 * @autor 10758
 * @system hello-world
 * @Time 2018/11/24
 */
public class Study {
    public static void main(String[] args) {
        int i = 0;
        int o = 0;
      /*  i++;  i=i+1;
        ++i;*/

        int b = 5 + i++;
        // b=5+i
        // i=i+1;
        int c = 5 + ++o;
        // o=o+1;
        // c= 5+o
        System.out.println(b);
        System.out.println(c);

        testFor();

        testWhile();

        testList();
    }

    private static void testList() {
        List<String> list = new ArrayList<>();
        list.add("a");

        list.add("b");

        for (String str : list) {
            System.out.println(str);
        }

        Map<String, String> map = new HashMap<>();
        map.put("age", "18");
        map.put("name", "zhangsan");

        for (Map.Entry<String, String> entity : map.entrySet()) {
            System.out.println("key =" + entity.getKey() + " , value=" + entity.getValue());
        }

        map.forEach((key,value)->{
            System.out.println("key =" + key + " , value=" + value);
        });
    }

    private static void testWhile() {
        int i = 10;
        while (i < 10) {
            ++i;
        }
        System.out.println(i);

        i = 10;
        do {
            ++i;
        } while (i < 10);
        System.out.println(i);
    }

    private static void testFor() {

        // 打印10次 i的值
        for (int i = 0; i <= 9; i++) {
            System.out.println(" i=" + i);
        }

        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += i;
            // result = result+i
        }
        System.out.println(" 1->100 sum =" + result);


        List<String> list = Arrays.asList("1", "2", "3");

        for (String str : list) {
            System.out.println(str);
        }

        list.stream().forEach(v -> System.out.println(v));

        //  list  map
    }


}
