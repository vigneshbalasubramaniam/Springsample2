/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.main;

import com.spr.Employee;
import com.spr.department;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author vi391762
 */
public class springmain {
    public static void main(String[] args)
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("xmlconfig.xml");
        Employee emp=(Employee)context.getBean("employee");
        System.out.println("empid:"+emp.getEmpid()+" name:"+emp.getName()+" job:"+emp.getJob());
        System.out.println("street:"+emp.getAddress().getStreet()+" Location:"+emp.getAddress().getLocation());
        department dep=(department)context.getBean("department");
        System.out.println("dept name:"+dep.getName()+" dept location:"+dep.getLocation());
        System.out.println("list of jobs:");
        for(String s:dep.getJobs())
            System.out.println(s);
    }
    
}
