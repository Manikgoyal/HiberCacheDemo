package com.techdazzler.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.techdazzler.hibernate.model.Employee;

public class AbstractDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }
 
    public void persist(Object entity) {
        getSession().persist(entity);
    }
 
    public void delete(Object entity) {
        getSession().delete(entity);
    }

	
	
}
