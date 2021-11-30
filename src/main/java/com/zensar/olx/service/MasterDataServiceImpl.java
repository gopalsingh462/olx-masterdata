package com.zensar.olx.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.olx.dto.Category;
import com.zensar.olx.dto.Status;
import com.zensar.olx.entity.CategoryEntity;
import com.zensar.olx.entity.StatusEntity;
import com.zensar.olx.repository.CategoryRepository;
import com.zensar.olx.repository.StatusRepository;

@Service
public class MasterDataServiceImpl implements MasterDataService {

	@Autowired
	CategoryRepository categoryRepository;
	@Autowired
	StatusRepository statusRepository;
	@Autowired
	ModelMapper modelMapper;

	public List<Category> getAllCategories() {
		List<CategoryEntity> categories = categoryRepository.findAll();
		List<Category> returningList = new ArrayList<>();
		for(CategoryEntity cat: categories) {
			returningList.add(modelMapper.map(cat, Category.class));
		}
		return returningList;
	}

	public List<Status> getAllStatues() {
		List<Status> statuses = new ArrayList<>();
		List<StatusEntity> list = statusRepository.findAll();
		for(StatusEntity en : list) {
			statuses.add(modelMapper.map(en, Status.class));
		}
		return statuses;
	}
}
