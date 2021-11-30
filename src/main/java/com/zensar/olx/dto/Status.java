package com.zensar.olx.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Status Model")
public class Status {
	@ApiModelProperty("Unique Identifier of the status")
	private int id;
	@ApiModelProperty("The name of the status")
	private String name;

	public Status() {
	}

	public Status(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

}
