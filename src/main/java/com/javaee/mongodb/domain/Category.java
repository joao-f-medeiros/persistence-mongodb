package com.javaee.mongodb.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category{

    private String id;
    private String description;

    private List<Garage> garages = new ArrayList<>();
}
