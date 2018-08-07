package com.bookme.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	
	
}
