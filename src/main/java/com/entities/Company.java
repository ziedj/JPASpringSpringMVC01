package com.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "company_db")
public class Company implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@NotNull
	@GeneratedValue
	private Long Id;

	@Column(name = "name")
	private String name;

	private int nbEmployees;

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Company(String name, int nbEmployees) {
		super();
		this.name = name;
		this.nbEmployees = nbEmployees;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNbEmployees() {
		return nbEmployees;
	}

	public void setNbEmployees(int nbEmployees) {
		this.nbEmployees = nbEmployees;
	}

	@Override
	public String toString() {
		return "Company [Id=" + Id + ", name=" + name + ", nbEmployees="
				+ nbEmployees + "]";
	}

}
