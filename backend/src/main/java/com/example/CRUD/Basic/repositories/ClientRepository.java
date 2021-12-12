package com.example.CRUD.Basic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CRUD.Basic.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
