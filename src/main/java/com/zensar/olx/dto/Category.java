package com.zensar.olx.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Category Model")
public class Category {
	@ApiModelProperty("Unique Identifier of the category")
	private int id;
	@ApiModelProperty("The name of the category")
	private String name;

	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Category() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
