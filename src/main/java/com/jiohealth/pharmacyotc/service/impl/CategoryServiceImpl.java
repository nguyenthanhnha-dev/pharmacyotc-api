package com.jiohealth.pharmacyotc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiohealth.pharmacyotc.dao.CategoryDao;
import com.jiohealth.pharmacyotc.dto.Category;
import com.jiohealth.pharmacyotc.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryDao categoryDao;
	
	@Override
	public List<Category> findAll() {
		return categoryDao.findAll();
	}

}
