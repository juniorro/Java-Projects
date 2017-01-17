 package com.main.repositories;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.main.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
	
	@Query("SELECT o FROM Transaction o WHERE o.account.AccountCode=:x order by o.transactionDate DESC")
	
	public Page<Transaction> TransactionList(@Param("x")String accountcode, Pageable pageable);	
	

}
