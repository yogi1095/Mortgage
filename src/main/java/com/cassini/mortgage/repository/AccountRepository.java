package com.cassini.mortgage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cassini.mortgage.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

}
