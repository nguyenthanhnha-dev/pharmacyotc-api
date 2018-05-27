package com.jiohealth.pharmacyotc.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jiohealth.pharmacyotc.dto.Category;

public class CategoryRowMapper implements RowMapper<Category> {
	
	@Override
	public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
		Category category = new Category();
		category.setCategoryId(rs.getInt("CategoryID"));
		category.setName(rs.getString("Name"));
		category.setImageURL(rs.getString("ImageURL"));
		return category;
	}

}
