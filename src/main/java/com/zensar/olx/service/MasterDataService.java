package com.zensar.olx.service;

import java.util.List;

import com.zensar.olx.dto.Category;
import com.zensar.olx.dto.Status;

public interface MasterDataService {
	public List<Category> getAllCategories();
	public List<Status> getAllStatues();
}
