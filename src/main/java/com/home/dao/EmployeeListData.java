package com.home.dao;

import com.home.pojo.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListData {
    List<Employee> list = new ArrayList<>();
    public List<Employee> getList(){
        try{
            Employee employee = new Employee();
            employee.setAddress("sdf");
            employee.setName("jkjkjkjkjk");
            list.add(employee);
        }
        catch(Exception e){
            System.out.println("excccccccccccccccccccccccc"+e);
        }
        return list;
    }
}
