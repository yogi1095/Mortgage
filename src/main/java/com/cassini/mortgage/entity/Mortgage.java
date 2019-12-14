package com.cassini.mortgage.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@SequenceGenerator(name = "mortgageId", initialValue = 6098765, allocationSize = 1)
public class Mortgage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mortgageId")
	private Long mortgageId;
	private Double mortgageAmount;
	private Double closingAmount;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id")
	private Customer customer;
	private LocalDate creationDate;

}
