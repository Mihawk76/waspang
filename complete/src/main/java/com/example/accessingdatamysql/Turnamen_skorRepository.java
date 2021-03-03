package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Modifying;
import com.example.accessingdatamysql.Turnamen_skor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface Turnamen_skorRepository extends CrudRepository<Turnamen_skor, Integer> {
//public interface ThRepository extends CrudRepository<Th, Integer> {

	//@Query(value = "SELECT u.burung_id,u.turnamen_id, sum(u.skor) as skor FROM Turnamen_skor u WHERE u.turnamen_id = ?1 group by u.burung_id,u.turnamen_id")
	@Query(value = "SELECT u FROM Turnamen_skor u WHERE u.turnamen_id = ?1")
        List<Turnamen_skor> findSkorPeserta(Integer turnamen_id);
}
