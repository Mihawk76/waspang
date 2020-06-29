package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatamysql.Peserta;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface PesertaRepository extends CrudRepository<Peserta, Integer> {
//public interface ThRepository extends CrudRepository<Th, Integer> {

}
