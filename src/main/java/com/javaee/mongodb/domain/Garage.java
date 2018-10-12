package com.javaee.mongodb.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Garage {

	private String id;
	private String name;
	private String address;
	private GasStation gasStation;
	
	private List<Category> categories = new ArrayList<>();
}
