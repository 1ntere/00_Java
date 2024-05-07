package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	public String kind;
	public String name;
	public String flavor;
	public int numOf;
	public int price;
	
	public SnackController() {
		
	}
	
	Snack s = new Snack();
	
	
	public String saveData(String kind, String name, String flavor,
			int numOf, int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	
}
