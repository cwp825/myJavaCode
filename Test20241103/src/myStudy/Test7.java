package myStudy;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User u1 = new User("zhangsan","001","123456");
        User u2= new User("lisi","002","12345678");
        User u3 = new User("wangwu","003","12345678910");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        int flag = isContains(list,"0033");
        System.out.println(flag);

    }

    public static int isContains(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getUserId().equals(id)){
                return i;
            }
        }
        return -1;

    }


}
