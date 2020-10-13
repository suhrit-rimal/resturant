package com.resturant.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MenuItem extends BaseEntity {
	public MenuItem(String id, String name, BigDecimal price, Integer calories) {
		super(id);
		this.name = name;
		this.price = price;
		this.calories = calories;
	}

	private String name;
	private BigDecimal price;
	private Integer calories;
}
