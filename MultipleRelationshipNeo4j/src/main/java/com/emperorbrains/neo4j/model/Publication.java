package com.emperorbrains.neo4j.model;

import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.springframework.lang.Nullable;

@NodeEntity
public class Publication {
	
	@Id @GeneratedValue
	Long id;
	@Nullable String publicationName;
	
	@Relationship(type="Authers")
	@Nullable List<Faculty> facultyName1;
	@Nullable List<String> facultyName;
	
	public String get(int arg0) {
		return facultyName.get(arg0);
	}
	
	public int indexOf(Object arg0) {
		return facultyName.indexOf(arg0);
	}
	
	public String remove(int arg0) {
		return facultyName.remove(arg0);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPublicationName() {
		return publicationName;
	}

	public void setPublicationName(String publicationName) {
		this.publicationName = publicationName;
	}

	public List<Faculty> getFacultyName1() {
		return facultyName1;
	}

	public void setFacultyName1(List<Faculty> facultyName1) {
		this.facultyName1 = facultyName1;
	}

	public List<String> getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(List<String> facultyName) {
		this.facultyName = facultyName;
	}

	/**
	 * @param id
	 * @param publicationName
	 * @param facultyName1
	 * @param facultyName
	 */
	public Publication(Long id, String publicationName, List<Faculty> facultyName1, List<String> facultyName) {
		super();
		this.id = id;
		this.publicationName = publicationName;
		this.facultyName1 = facultyName1;
		this.facultyName = facultyName;
	}
	
	
}
