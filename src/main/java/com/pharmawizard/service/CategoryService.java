package com.pharmawizard.service;

import java.util.List;

import com.pharmawizard.domain.Category;

public interface CategoryService {

	Category getCategoryById(long idCategory);

	Category createCategory(Category category);

	Category updateCategory(Category category);

	boolean deleteCategory(Category category);

	List<Category> getAllCategories();

}
