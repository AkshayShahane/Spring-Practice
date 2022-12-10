package com.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.Dao.StudentDao;
import com.practice.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao bean = context.getBean("studentDaoImpl",StudentDao.class);
        
        Student s = new Student();
        s.setName("Mr.bean");
        s.setCity("UK");
        s.setId(789);
        bean.update(s);
    }
}
