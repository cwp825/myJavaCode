package StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        loop: while (true) {
            System.out.println("----------欢迎来到学生管理系统----------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入您的选择：");

            Scanner sc = new Scanner(System.in);

            String choice = sc.next();
            switch (choice){
                case "1":
                    addStudent(list);
                    break;
                case "2":
                    deleteStudent(list);
                    break;
                case "3":
                    updateStduent(list);
                    break;
                case "4":
                    queryStudent(list);
                    break;
                case "5":
                    System.out.println("5：退出");
                    break loop;
                default:
                    System.out.println("输入错误，请重新输入：");
                    break;

            }
        }


    }

    public static boolean isContain(ArrayList<Student> list,String id){
//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i).getId().equals(id)){
//                return true;
//            }
//        }
//        return false;

        return getIndex(list,id)>=0;
    }

    public static int getIndex(ArrayList<Student> list,String id){
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if(s.getId().equals(id)){
                return i;
            }
        }
        return -1;
    }


    public static void addStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        while (true) {
            System.out.println("请输入id：");
            String id = sc.next();
            if(isContain(list,id)){
                System.out.println("id重复，请重新录入");
            }else{
                s.setId(id);
                break;
            }
        }

        System.out.println("请输入学生姓名：");
        String name = sc.next();
        s.setName(name);

        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("请输入学生家庭住址：");
        String family = sc.next();
        s.setFamily(family);


        list.add(s);
        System.out.println("学生信息添加成功");


    }

    public static void deleteStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入要删除的学生id：");
        String sId = sc.next();
        int index =getIndex(list,sId);
        if(index>=0){
            list.remove(index);
            System.out.println("id:"+sId+"的学生删除成功");
        }else{
            System.out.println("id:"+sId+"的学生不存在");
        }

    }

    public static void updateStduent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入需要修改的学生的id：");
        String id = sc.next();
        int index = getIndex(list, id);
        if(index==-1){
            System.out.println("要修改的学生id："+id+"不存在，重新输入");
            return;
        }
        Student s = list.get(index);
        System.out.println("请输入需要修改的学生姓名：");
        String newName = sc.next();
        s.setName(newName);
        System.out.println("请输入需要修改的学生年龄：");
        int newAge = sc.nextInt();
        s.setAge(newAge);
        System.out.println("请输入需要修改的学生家庭住址");
        String newFamily = sc.next();
        s.setFamily(newFamily);

    }

    public static void queryStudent(ArrayList<Student> list){
        if(list.size() == 0){
            System.out.println("当前无学生信息，请添加后再查询");
        }
        System.out.println("id\t\t姓名\t\t年龄\t\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getId()+"\t\t"+s.getName()+"\t"+s.getAge()+"\t\t"+s.getFamily());
        }

    }





}
