package com.leon.mybatis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.leon.mybatis.entity.User;
import com.leon.mybatis.service.UserService;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("mybatis.xml");
        UserService service = (UserService) cxt.getBean("userService");
        User u = service.selectUserById(1);
        System.out.println(u.getName());
    }

}
