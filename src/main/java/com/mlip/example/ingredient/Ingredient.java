package com.mlip.example.ingredient;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * TODO mlip; javadoc
 *
 * @author mlipski
 */
@XStreamAlias("ingredient")
public class Ingredient {

	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
