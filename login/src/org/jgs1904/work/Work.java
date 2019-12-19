package org.jgs1904.work;


import org.jgs1904.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName Work
 * @Description TODO
 * @Author Liu
 * @Since 2019/12/18 0018 15:36
 */
public class Work {
    private static Scanner sc = new Scanner(System.in);
    private static List<User> list = new ArrayList<>();

    public static void main(String[] args) {
        do {
            System.out.println("请选择：1注册  2登陆  3修改密码");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("请输入姓名：");
                    String name = sc.next();
                    System.out.println("请输入用户名：");
                    String username = sc.next();
                        System.out.println("请输入密码：");
                        String password = sc.next();
                        list.add(new User(name, username, password));
                        System.out.println("注册成功！");
                    continue;
                case 2:
                    System.out.println("请输入用户名：");
                    String username1 = sc.next();
                    System.out.println("请输入密码：");
                    String password1 = sc.next();
                    for (User user : list) {
                        if (username1.equals(user.getUsername()) && password1.equals(user.getPassword())) {
                            System.out.println("登陆成功！");
                        } else {
                            System.out.println("用户名或密码有误！");
                        }
                    }
                    continue;
                case 3:
                    System.out.println("请输入用户名：");
                    String username2 = sc.next();
                    System.out.println("请输入密码：");
                    String password2 = sc.next();
                    for (User user : list) {
                        if (username2.equals(user.getUsername()) && password2.equals(user.getPassword())) {
                            System.out.println("请输入新密码：");
                            String newPwd = sc.next();
                            user.setPassword(newPwd);
                            System.out.println("密码修改成功！");
                        } else {
                            System.out.println("用户名或密码有误！");
                        }
                    }
                    continue;
                default:
                    System.out.println("输入错误！");
                    continue;
            }
        } while (true);
    }
}
