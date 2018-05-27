package com.jiohealth.pharmacyotc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jiohealth.pharmacyotc.dto.Category;


public interface CategoryService {
	
	List<Category> findAll();

}
