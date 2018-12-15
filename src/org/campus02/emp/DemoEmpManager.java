package org.campus02.emp;

import java.util.ArrayList;

public class DemoEmpManager {

    private static EmployeeManager em;

    public static void main(String[] args) {

        em = new EmployeeManager();

        Employee e = em.findByEmpNumber(1234);
        System.out.println("e = " + e);

        e = em.findByMaxSalary();
        System.out.println("e = " + e);

        em.addEmployee(new Employee(1234,"Hans-Peter",1500.00,"CAMPUS02-IWI"));

        e = em.findByEmpNumber(1234);
        System.out.println("e = " + e);

        em.addEmployee(new Employee(5431,"Stephan",4500.00,"CAMPUS02-IWI"));
        em.addEmployee(new Employee(8567,"Max",5100.00,"CAMPUS02-INNO"));

        ArrayList<Employee> found = em.findByDepartment("CAMPUS02-IWI");
        System.out.println("found = " + found);

        Employee superPartie = em.findByMaxSalary();

        System.out.println("superPartie = " + superPartie);

    }

}


