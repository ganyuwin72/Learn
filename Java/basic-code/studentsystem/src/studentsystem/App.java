package studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--------------欢迎来到学生管理系统--------------");
            System.out.println("1：登录");
            System.out.println("2：注册");
            System.out.println("3：忘记密码");
            System.out.println("4：退出");
            System.out.println("请输入您的选择：");
            String choose = sc.next();
            switch (choose) {
                case "1" -> login(userList);
                case "2" -> register(userList);
                case "3" -> forgetPassword(userList);
                case "4" -> {
                    System.out.println("系统退出，谢谢使用！");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项，请重新输入！");
            }
        }
    }

    // 登录
    public static void login(ArrayList<User> userList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("登录系统");
    }

    // 注册
    public static void register(ArrayList<User> userList) {
        Scanner sc = new Scanner(System.in);
        String username;
        while (true) {
            System.out.println("请输入注册用户名：");
            System.out.println("用户名要求：1.长度在3-15之间 2.只能是字母加数字的组合，但不能是纯数字");
            username = sc.next();
            if (!checkUsername(username)) {
                System.out.println("用户名不符合要求，请重新输入！");
            } else if (containsUsername(userList, username)) {
                System.out.println("用户名已存在，请重新输入！");
            } else {
                break;
            }
        }

        String password1, password2;
        while (true) {
            System.out.println("请输入密码：");
            password1 = sc.next();
            System.out.println("请再次输入密码：");
            password2 = sc.next();
            if (!password1.equals(password2)) {
                System.out.println("两次密码输入不一致，请重新输入！");
            } else {
                break;
            }
        }

        String personID;
        while (true) {
            System.out.println("请输入身份证号码：");
            personID = sc.next();
            if (checkPersonID(personID)) {
                break;
            } else {
                System.out.println("身份证号码格式不正确，请重新输入！");
            }
        }

        String phoneNumber;
        while (true) {
            System.out.println("请输入手机号码：");
            phoneNumber = sc.next();
            if (checkPhoneNumber(phoneNumber)) {
                break;
            } else {
                System.out.println("手机号码格式不正确，请重新输入！");
            }
        }

        User u = new User(username, password1, personID, phoneNumber);
        userList.add(u);
        System.out.println("注册成功！");

    }

    // 忘记密码
    public static void forgetPassword(ArrayList<User> userList) {
        System.out.println("忘记密码");
    }

    // 判断用户名是否满足要求
    public static boolean checkUsername(String username) {
        // 用户名长度在3-15之间
        if (username.length() < 3 || username.length() > 15) {
            return false;
        }

        // 用户名只能是字母加数字的组合，但不能是纯数字
        if (username.matches("[0-9]+")) {
            return false;
        }
        if (!username.matches("[a-zA-Z0-9]+")) {
            return false;
        }
        return true;
    }

    // 判断用户名是否存在
    public static boolean containsUsername(ArrayList<User> userList, String username) {
        /*for (User user : userList) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;*/
        return getUsernameIndex(userList, username) != -1;
    }

    // 获取用户名的索引
    public static int getUsernameIndex(ArrayList<User> userList, String username) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUsername().equals(username)) {
                return i;
            }
        }
        return -1;
    }

    // 判断身份号码格式是否正确
    public static boolean checkPersonID(String personID) {
        // 身份证格式要求：
        // 1.长度为18位
        // 2.不能以0为开头
        // 3.前17位必须都是数字
        // 4.最后一位可以是数字，也可以是大写X或者小写x
        if (personID == null || personID.length() != 18) {
            return false;
        }
        if (personID.charAt(0) == '0') {
            return false;
        }
        if (personID.substring(0, 17).matches("[0-9]+") == false) {
            return false;
        }
        if (personID.charAt(17) != 'X' && personID.charAt(17) != 'x' && !Character.isDigit(personID.charAt(17))) {
            return false;
        }
        return true;
    }

    // 判断手机号码格式是否正确
    public static boolean checkPhoneNumber(String phoneNumber) {
        // 长度为11位且全部是数字
        // 不能以0开头
        if (phoneNumber == null || phoneNumber.length() != 11) {
            return false;
        }
        if (phoneNumber.charAt(0) == '0') {
            return false;
        }
        if (!phoneNumber.matches("[0-9]+")) {
            return false;
        }
        return true;
    }
}
