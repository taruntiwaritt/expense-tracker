package com.example.expense.manager.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.expense.manager.expense.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	Category findByName(String name);
}
