package myStudy;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.add('h');
        list.add('e');
        list.add('l');
        list.add('l');
        list.add('o');
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i==list.size()-1){
                System.out.print(list.get(i)+"]");
            }else{
                System.out.print(list.get(i)+", ");
            }
        }
    }
}
