package me.ffulauh.springsource;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryTest {

    public static void main(String[] args) {
        BeanFactory bf=new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
//        ApplicationContext bf=new ClassPathXmlApplicationContext("beanFactoryTest.xml");
        MyTestBean bean=(MyTestBean) bf.getBean("myTestBean");
        String hehe=bean.getTestStr();
        System.out.println(hehe);
    }

}
