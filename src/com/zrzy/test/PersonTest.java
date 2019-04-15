package com.zrzy.test;

import com.zrzy.entity.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: 徐大伟
 * User: ${和敬清寂}
 * Date: 2019/4/15
 * Time: 17:14
 */
public class PersonTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
        // bean注入
        Person person = classPathXmlApplicationContext.getBean("person", Person.class);
        System.out.println(person);

        // 内部bean
        Person person2 = classPathXmlApplicationContext.getBean("person2", Person.class);
        System.out.println(person2);

        // 注入null
        Person person3 = classPathXmlApplicationContext.getBean("person3", Person.class);
        System.out.println(person3);

        // 级联注入
        Person person4 = classPathXmlApplicationContext.getBean("person4", Person.class);
        System.out.println(person4);

        // 集合<List>注入
        Person person5 = classPathXmlApplicationContext.getBean("person5", Person.class);
        System.out.println(person5.getAddress());

        // 集合<Set>注入
        Person person6 = classPathXmlApplicationContext.getBean("person6", Person.class);
        System.out.println(person6.getHobby());

        // 集合<Map>注入
        Person person7 = classPathXmlApplicationContext.getBean("person7", Person.class);
        System.out.println(person7.getDream());

        //properties; // 性能
        Person person8 = classPathXmlApplicationContext.getBean("person8", Person.class);
        System.out.println(person8.getProperties());

    }


}
