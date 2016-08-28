package com.nikita.security.mainHelp;

import com.nikita.security.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by FromxSoul on 29.08.2016.
 */
public class Main {

    public static void main (String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:\\D:\\JavaSpring\\SomeHS\\src\\main\\webapp\\WEB-INF\\mvc-dispatcher-servlet.xml");
        UserService userService = applicationContext.getBean(UserService.class);
    }

}
