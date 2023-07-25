package com.yogesh.lib.library.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Joga_Yogesh
 * 
 *  Model class using MongoDB Database
 *  Easy to handle
 *  Not require to SQL language 
 *  Flexible to use
 *  Easy to Scale the application
 */

@Data
@Document(collection="mybooks")
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	
	@Id
	private int id;
	private String bookName;
	private String authorName;
	private double rentPerDay;
	private String genresType;
}
