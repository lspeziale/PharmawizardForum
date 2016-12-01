package com.pharmawizard.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pharmawizard.domain.Category;

@Service
public interface CategoryService {

	Category getCategoryById(long idCategory);

	Collection<Category> getAllCategories();

}
