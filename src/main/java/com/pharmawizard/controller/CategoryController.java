package com.pharmawizard.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pharmawizard.domain.Category;
import com.pharmawizard.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	Logger logger = Logger.getGlobal();

	private final CategoryService categoryService;

	@Autowired
	public CategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@RequestMapping(value = { "/getCategoryById" }, method = RequestMethod.GET)
	public Category getCategoryById(Long idCategory) {
		return categoryService.getCategoryById(idCategory);
	}

	@RequestMapping(value = { "/createCategory" }, method = RequestMethod.POST)
	public Category createCategory(Category category) {
		return categoryService.createCategory(category);
	}

	@RequestMapping(value = { "/getAllCategories" }, method = RequestMethod.GET)
	public List<Category> getAllCategories() {
		return categoryService.getAllCategories();
	}

	@RequestMapping(value = { "/updateCategory" }, method = RequestMethod.POST)
	public Category updateCategory(Category category) {
		return categoryService.updateCategory(category);
	}

	@RequestMapping(value = { "/deleteCategory" }, method = RequestMethod.DELETE)
	public boolean deleteCategory(Category category) {
		return categoryService.deleteCategory(category);
	}

}
