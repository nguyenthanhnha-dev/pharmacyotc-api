package com.jiohealth.pharmacyotc.dao;

import java.util.List;

import com.jiohealth.pharmacyotc.dto.Category;

public interface CategoryDao {
	
	List<Category> findAll();

}
