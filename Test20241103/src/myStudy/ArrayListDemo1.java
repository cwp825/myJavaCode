package myStudy;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        boolean result = list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        String result1 = list.remove(0);
        boolean result2 = list.remove("bbb");

        String result3 = list.set(0, "aaa");

        System.out.println(result3);
        System.out.println(result2);

        System.out.println(result);

        System.out.println(result1);

        System.out.println(list);


    }
}
