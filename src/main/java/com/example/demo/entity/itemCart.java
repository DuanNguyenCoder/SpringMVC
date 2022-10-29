package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class itemCart {

private int id;
private String name;
private String description;
private double price;
private String categories;
private int quantity;

}
