package com.pharmawizard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharmawizard.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	public Category findByName(String name);
}
