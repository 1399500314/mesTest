package com.tap.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tap.dao.CategoryMapper;


@Service
public class CategoryService {
	@Resource
	private CategoryMapper categoryMapper;

	public void deleteByPrimaryKey(int i) {
		categoryMapper.deleteByPrimaryKey(i);
	}

}
