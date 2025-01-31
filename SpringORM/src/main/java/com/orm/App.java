package com.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orm.dao.UserDao;
import com.orm.model.User;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con = new ClassPathXmlApplicationContext("connection.xml");
        UserDao dao  =(UserDao) con.getBean("dao");
         
        List<User> list= dao.getAllUser();
        System.out.println(list);
    }
}
