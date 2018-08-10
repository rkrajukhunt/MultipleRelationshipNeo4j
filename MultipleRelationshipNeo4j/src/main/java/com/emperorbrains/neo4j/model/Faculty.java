package com.emperorbrains.neo4j.model;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.lang.Nullable;

@NodeEntity
public class Faculty {
	
	@Id @GeneratedValue
	Long id;
	@Nullable String name;
	@Nullable String email;
	
	public Faculty() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param id
	 * @param name
	 * @param email
	 */
	public Faculty(Long id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
