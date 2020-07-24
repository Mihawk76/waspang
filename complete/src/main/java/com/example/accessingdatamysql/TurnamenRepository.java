package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import com.example.accessingdatamysql.Turnamen;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface TurnamenRepository extends CrudRepository<Turnamen, Integer> {
//public interface ThRepository extends CrudRepository<Th, Integer> {


	@Query(value = "SELECT u FROM Turnamen u")
	List<Turnamen> findTurnamen();
}
