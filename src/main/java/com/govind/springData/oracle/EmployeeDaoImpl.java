package com.govind.springData.oracle;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Repository("EmployeeDaoImpl")
@Transactional(propagation = Propagation.REQUIRED)
public class EmployeeDaoImpl implements EmployeeDao
{
	
	private EntityManager entityManager;



	@Override
	public UsersLoggedInVO findByPrimaryKey(Integer id)
	{
		UsersLoggedInVO employee = entityManager.find(UsersLoggedInVO.class, id);

			return employee;
	}

	/**
	 * @return the entityManager
	 */
	public EntityManager getEntityManager()
	{
		    return entityManager;
	}

	/**
	 * @param entityManager the entityManager to set
	 */
	//@Autowired
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager)
	{
		    this.entityManager = entityManager;
	}
}
