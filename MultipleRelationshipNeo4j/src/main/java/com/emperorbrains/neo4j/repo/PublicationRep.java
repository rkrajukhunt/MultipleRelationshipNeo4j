package com.emperorbrains.neo4j.repo;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.emperorbrains.neo4j.model.Publication;

public interface PublicationRep extends Neo4jRepository<Publication, Long>{

}
