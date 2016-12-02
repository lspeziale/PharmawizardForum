package com.pharmawizard.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.pharmawizard.domain.Category;
import com.pharmawizard.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	Logger logger = Logger.getGlobal();

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
	public List<Category> getAllCategories() {
		return categoryRepository.findAll(new Sort("name"));
	}

	@Override
	public Category createCategory(Category category) {
		return categoryRepository.save(new Category(category.getName()));
	}

	@Override
	public Category updateCategory(Category category) {

		return categoryRepository.save(category);

	}

	@Override
	public boolean deleteCategory(Category category) {
		if (categoryRepository.exists(category.getIdCategory())) {
			categoryRepository.delete(category);
			return true;
		} else {
			logger.info("Category doesn't exist");
			return false;
		}
	}

}
