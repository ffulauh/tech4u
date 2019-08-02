package me.ffulauh.springsource.jdbctemplate;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {
    public static void main(String[] args) {
        BeanFactory bf=new XmlBeanFactory(new ClassPathResource("jdbcTemplate.xml"));
        UserService userService=(UserService) bf.getBean("userService");
        User han=new User();
        han.setName("han");
        han.setAge(24);
        userService.save(han);
        System.out.println("heheh");

    }
}
