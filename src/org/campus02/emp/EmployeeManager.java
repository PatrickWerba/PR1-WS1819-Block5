package org.campus02.emp;

import java.util.ArrayList;

public class EmployeeManager {

    private ArrayList<Employee> employees
                    = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public Employee findByEmpNumber(int number) {

        for(Employee e : employees) {
            if(number == e.getEmpNumber()) {
                return e;
            }
        }

        return null;

    }

    public ArrayList<Employee> findByDepartment(String department) {

        ArrayList<Employee> foundResult = new ArrayList<>();

        for(Employee e : employees) {
            if(department.equals(e.getDepartment())) {
                foundResult.add(e);
            }
        }

        return foundResult;

    }



}
