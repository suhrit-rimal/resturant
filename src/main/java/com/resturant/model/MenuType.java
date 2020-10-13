package com.resturant.model;

public enum MenuType {
	APPETIZERS("Appetizers"),
	MAIN_COURSE("Main Course"),
	DESSERT("Dessert"),
	BEVERAGE("Beverage");

	private String name;

	MenuType(String menuTypeName) {
		this.name = menuTypeName;
	}

	public String getName() {
		return this.name;
	}

}
