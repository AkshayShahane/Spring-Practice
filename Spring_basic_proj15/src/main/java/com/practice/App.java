package com.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.dao.StudentDao;
import com.practice.entity.Student;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao bean = context.getBean("studentDaoimpl",StudentDao.class);
        	
        Student s = new Student();
        s.setId(789);
        s.setName("Aman");
        s.setCity("Delhi");
        int result = bean.insert(s);
        System.out.println("Record inserted : "+result);
    }
}
