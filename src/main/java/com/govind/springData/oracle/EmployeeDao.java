package com.govind.springData.oracle;

import java.sql.SQLException;


public interface EmployeeDao
{
	//void save(Employee employee) throws SQLException;

	UsersLoggedInVO findByPrimaryKey(Integer id) throws SQLException;
}
