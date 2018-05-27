package com.jiohealth.pharmacyotc.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jiohealth.pharmacyotc.dao.CategoryDao;
import com.jiohealth.pharmacyotc.dao.rowmapper.CategoryRowMapper;
import com.jiohealth.pharmacyotc.dto.Category;

@Repository
public class CategoryDaoImpl extends GenericDaoImpl implements CategoryDao {
	
	public List<Category> findAll() {
		String sql = "SELECT * FROM category";
		return jdbcTemplate.query(sql, new CategoryRowMapper());
	}

}
