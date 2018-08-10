package com.emperorbrains.neo4j.repo;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.emperorbrains.neo4j.model.Faculty;

public interface FacultyRep extends Neo4jRepository<Faculty, Long>{

	public Faculty findByEmail(String emial);  
}
