package com.main.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.main.entities.Account;

public interface AccountRepository extends JpaRepository<Account, String> {

}
