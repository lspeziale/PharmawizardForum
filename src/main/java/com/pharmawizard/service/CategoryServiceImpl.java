package com.pharmawizard.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import com.pharmawizard.domain.Category;
import com.pharmawizard.repository.CategoryRepository;

public class CategoryServiceImpl implements CategoryService {

	private final CategoryRepository categoryRepository;

	@Autowired
	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	@Override
	public Category getCategoryById(long idCategory) {
		return categoryRepository.findOne(idCategory);
	}

	@Override
	public Collection<Category> getAllCategories() {
		return categoryRepository.findAll(new Sort("name"));
	}

}
