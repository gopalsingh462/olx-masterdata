package com.zensar.olx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olx.dto.Category;
import com.zensar.olx.dto.Status;
import com.zensar.olx.service.MasterDataService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("olx/masterdata")
public class MasterDataController {
	@Autowired
	MasterDataService masterDataService;
	
	@GetMapping(value = "/categories", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value="Get all categories")
	public List<Category> getAllCategories() {
		return masterDataService.getAllCategories();
	}

	@GetMapping(value = "/statuses", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value="Get all statuses")
	public List<Status> getAllStatues() {
		return masterDataService.getAllStatues();
	}

}
