package com.konstantin.spring.rest;

import com.konstantin.spring.rest.configuration.MyConfig;
import com.konstantin.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//        allEmployees.forEach(System.out::println);

//        Employee employee = communication.getEmployee(1);
//        System.out.println(employee);

//        Employee employee = new Employee("Olya", "Panteleeva", "Sales", 101);
//        employee.setId(12);
//        communication.saveEmployee(employee);

        communication.deleteEmployee(12);
    }
}
