package com.main.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.main.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
