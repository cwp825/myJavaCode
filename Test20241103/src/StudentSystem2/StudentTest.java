package StudentSystem2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        while(true){
            Scanner sc = new Scanner(System.in);
            menu();
            String choice = sc.next();

            switch (choice){
                case "1":
                    add(list);
                    break;


            }
        }

    }

    public static void menu(){
        System.out.println("--------欢迎来到学生系统--------");
        System.out.println("1：添加学生");
        System.out.println("2：删除学生");
        System.out.println("3：修改学生");
        System.out.println("4：查询学生");
        System.out.println("5：退出" );
        System.out.println("请输入你的选择：");
    }


    public static void add(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        if(list.)



    }


}


