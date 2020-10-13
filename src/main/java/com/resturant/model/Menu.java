package com.resturant.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Menu extends BaseEntity {
	List<SubMenu> subMenu;
}
