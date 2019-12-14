package com.cassini.mortgage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cassini.mortgage.entity.Mortgage;

public interface MortgageRepository extends JpaRepository<Mortgage, Long>{

}
