package com.home.controller;

import com.home.dao.EmployeeListData;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletResponse;

import com.home.pojo.Employee;

import java.util.ArrayList;
import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EmployeeController {

    EmployeeListData employeeListData = new EmployeeListData();
	 List<Employee> list = new ArrayList<>();
    @GetMapping(value = "/employee")
    public @ResponseBody List<Employee> giveSugar(HttpServletResponse response) {
	   response.setContentType("application/json");  
       System.out.println("asdfsadfasdfasdfsadfasdfasdf");
       System.out.println("asdfsadfasdfasdfsadfasdfasdf");
       System.out.println("asdfsadfasdfasdfsadfasdfasdf");
       System.out.println("asdfsadfasdfasdfsadfasdfasdf");
       System.out.println("asdfsadfasdfasdfsadfasdfasdf");
       System.out.println("asdfsadfasdfasdfsadfasdfasdf");
       list  = employeeListData.getList();
       return list;
    }

}
