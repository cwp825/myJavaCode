package myStudy;

import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();

        Phone p1 = new Phone("苹果",8999);
        Phone p2 = new Phone("小米",1999);
        Phone p3 = new Phone("锤子",2999);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        ArrayList<Phone> tmp = getPhoneInfo(list, 9000);
        for (int i = 0; i < tmp.size(); i++) {
            System.out.println(tmp.get(i).getBrand()+","+tmp.get(i).getPrice());
        }

    }

    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list,int price){
        ArrayList<Phone> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            if(p.getPrice()<price){
                result.add(p);
            }
        }
        return result;
    }

}
