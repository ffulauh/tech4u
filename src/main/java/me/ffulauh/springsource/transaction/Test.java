package me.ffulauh.springsource.transaction;

import me.ffulauh.springsource.jdbctemplate.User;
import me.ffulauh.springsource.jdbctemplate.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("jdbcTemplate.xml");
        UserService userService=(UserService) context.getBean("userService");
        User han=new User();
        han.setName("shaohua");
        han.setAge(24);
        userService.save(han);
        System.out.println("heheh");

    }
}
