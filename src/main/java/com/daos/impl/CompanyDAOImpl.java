package com.daos.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.daos.CompanyDAO;
import com.entities.Company;

@Component
@Transactional
public class CompanyDAOImpl implements CompanyDAO {

	@PersistenceContext
	EntityManager em;

	public void addCompany(Company company) {
		em.persist(company);
	}

}
