package com.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.daos.CompanyDAO;
import com.entities.Company;
import com.services.CompanyService;

@Component
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	CompanyDAO dao;

	public void addCompany(Company company) {
		dao.addCompany(company);
	}

}
