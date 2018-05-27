package com.jiohealth.pharmacyotc.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiohealth.pharmacyotc.dto.Category;
import com.jiohealth.pharmacyotc.service.CategoryService;


@Controller
@RequestMapping("/categories")
public class CategoryApi {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/all")
	@ResponseBody
	public List<Category> findAll() {
		return categoryService.findAll();
	}

}
