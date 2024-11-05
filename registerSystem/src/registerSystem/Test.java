package registerSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        loop:while (true) {
            menu();
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
            switch (choice){
                case "1":
                    login(list);
                    break;
                case "2":
                    register(list);
                    break;
                case "3":
                    System.out.println("忘记密码");
                    break;
                default:
                    break loop;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getUserName()+" ");
            System.out.print(list.get(i).getPassword()+" ");
            System.out.print(list.get(i).getPersonalId()+" ");
            System.out.print(list.get(i).getPhoneNumber()+" ");
        }


    }

    public static void menu(){
        System.out.println("欢迎来到学生管理系统");
        System.out.println("请选择操作：1登录 2注册 3忘记密码");
    }

    public static void register(ArrayList<User> list){
        User user = new User();
        Scanner sc = new Scanner(System.in);
        String userName = null;
        loop: while (true) {
            System.out.println("请输入用户名：");
            //userName
            userName = sc.next();

            if (userName.length()>15||userName.length()<3){
                System.out.println("用户名长度须在3-15之间,请重新输入：");
                continue;
            }

            int lowNumber = 0;
            int upNumber = 0;
            int numNumber = 0;
            for (int i = 0; i < userName.length(); i++) {

                if(userName.charAt(i)>='a'&&userName.charAt(i)<='z'){
                    lowNumber++;
                }else if (userName.charAt(i)>='A'&&userName.charAt(i)<='Z'){
                    upNumber++;
                }else if(userName.charAt(i)>='0'&&userName.charAt(i)<='9') {
                    numNumber++;
                }

            }
            if(numNumber ==userName.length()){
                System.out.println("用户名不能是纯数字,请重新输入");
                continue;
            }
            if(lowNumber+upNumber+numNumber!=userName.length()){
                System.out.println("用户名只能是字母加数字的组合,请重新输入");
                continue;
            }
            for (int i = 0; i < list.size(); i++) {
                User u = list.get(i);
                if(u.getUserName().equals(userName)){
                    System.out.println("该用户名已经存在！");
                    continue loop;
                }
            }
            user.setUserName(userName);
            System.out.println("id设置成功");
            break loop;
        }




        //passWord
        while(true) {
            System.out.println("第一次输入密码：");
            String passWord = sc.next();
            System.out.println("第二次输入密码：");
            String confirmPassWord = sc.next();
            if (passWord.equals(confirmPassWord)) {
                System.out.println("密码设置成功");
                user.setPassword(passWord);
                break;
            } else {
                System.out.println("输入密码不一致，请重新输入:");
            }
        }
        //personalId
        loop: while (true) {
            System.out.println("请输入身份证号码：");
            String personalId = sc.next();
            if(personalId.length()!=18){
                System.out.println("身份证号码为18位，请重新输入：");
                continue;

            }else if (personalId.charAt(0)=='0'){
                System.out.println("身份证第一位不为0，请重新输入");
                continue;
            }
            for (int i = 0; i < 17; i++) {
                if(personalId.charAt(i)<'0'||personalId.charAt(i)>'9'){
                    System.out.println("身份证前17位必须为数字,请重新输入：");
                    continue loop;
                }
            }
            if(personalId.charAt(17)=='X'|| personalId.charAt(17)=='x'||(personalId.charAt(17)>='0'&&personalId.charAt(17)<='9')){
                user.setPersonalId(personalId);
                break loop;
            }else{
                System.out.println("最后一位");
            }

        }

        //phoneNumber
        loop:while(true){
            System.out.println("请输入电话号码：");
            String phoneNumber = sc.next();
            if(phoneNumber.length()!=11){
                System.out.println("电话号码长度应为11位，请重新输入：");
                continue;
            }
            if(phoneNumber.charAt(0)=='0'){
                System.out.println("第一位不能为0，请重新输入：");
                continue;
            }
            for (int i = 0; i < phoneNumber.length(); i++) {
                if(phoneNumber.charAt(i)<'0'||phoneNumber.charAt(i)>'9'){
                    System.out.println("电话号码只能是数字，请重新输入：");
                    continue loop;
                }
            }
            user.setPhoneNumber(phoneNumber);
            break ;
        }
        list.add(user);

    }

    public static void login(ArrayList<User> list){
        int count = 0;
        loop: while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String userName = sc.next();

            //验证码

            int flag = getIndex(list,userName);
            if(flag ==-1){
                System.out.println("不存在该账户，请先注册");
                break loop;
            }else{
                System.out.println("请输入密码：");
                String passWord = sc.next();
                if(list.get(flag).getPassword().equals(passWord)) {
                    System.out.println("登录成功");
                    break loop;
                }
            }
        }

    }
    public static int getIndex(ArrayList<User> list,String userName){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUserName().equals(userName)) {
                return i;
            }
        }
        return -1;
    }



}

