package com.govind.springData.oracle;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@Autowired
	EmployeeDao empdao;
	
	@RequestMapping(value="/test")
	@ResponseBody
	public void test() throws SQLException{
		System.out.println("---");
		UsersLoggedInVO user = empdao.findByPrimaryKey(new Integer(1));
		System.out.println("---");
		System.out.println("---");
		
	}
	
}
