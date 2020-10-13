package com.resturant.services;

import static com.resturant.model.MenuType.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.resturant.model.Menu;
import com.resturant.model.MenuItem;
import com.resturant.model.SubMenu;

@Service
public class MenuServiceImpl implements MenuService {

	@Override
	public Menu getMenu() {
		// Hardcoing menu. THis will come from db when implemented.

		List<MenuItem> mainCourseList = new ArrayList<>();
		mainCourseList.add(new MenuItem(UUID.randomUUID().toString(), "Burger", new BigDecimal("10.00"), 900));
		mainCourseList.add(new MenuItem(UUID.randomUUID().toString(), "Salad", new BigDecimal("5.00"), 300));
		mainCourseList.add(new MenuItem(UUID.randomUUID().toString(), "Pizza", new BigDecimal("8.00"), 800));

		List<MenuItem> appetizersList = new ArrayList<>();
		appetizersList.add(new MenuItem(UUID.randomUUID().toString(), "Fries", new BigDecimal("10.00"), 900));
		appetizersList.add(new MenuItem(UUID.randomUUID().toString(), "Wings", new BigDecimal("5.00"), 300));

		List<MenuItem> beverageList = new ArrayList<>();
		beverageList.add(new MenuItem(UUID.randomUUID().toString(), "Beer", new BigDecimal("7.00"), 900));
		beverageList.add(new MenuItem(UUID.randomUUID().toString(), "Diet Coke", new BigDecimal("5.00"), 300));

		List<MenuItem> desertList = new ArrayList<>();
		desertList.add(new MenuItem(UUID.randomUUID().toString(), "Ice Cream", new BigDecimal("7.00"), 900));

		List<SubMenu> subMenus = new ArrayList<>();
		subMenus.add(new SubMenu(APPETIZERS, appetizersList));
		subMenus.add(new SubMenu(DESSERT, desertList));
		subMenus.add(new SubMenu(MAIN_COURSE, mainCourseList));
		subMenus.add(new SubMenu(BEVERAGE, beverageList));

		return new Menu(subMenus);
	}
}
