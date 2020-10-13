package com.resturant.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resturant.model.Menu;
import com.resturant.services.MenuService;

@RestController
@RequestMapping
public class MenuController {

	private MenuService menuService;

	@Autowired
	public MenuController(MenuService menuService) {
		this.menuService = menuService;
	}

	@GetMapping(value = "/menu")
	public Menu getMenu() {
		return menuService.getMenu();
	}
}
