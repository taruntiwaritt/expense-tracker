package com.example.expense.manager.expense.model;

import java.time.Instant;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
@Table(name="expense")
public class Expense {

	@Id
	private Long id;
	
	private Instant expensedate;
	
	private String descript;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private User user;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Category category;
}
