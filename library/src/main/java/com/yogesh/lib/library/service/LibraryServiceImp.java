package com.yogesh.lib.library.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.yogesh.lib.library.repo.LibraryRepo;
import com.yogesh.lib.library.model.Book;

@Service
public class LibraryServiceImp {

	@Autowired(required = false)
	LibraryRepo libraryRepo;

	/**
	 * Create a new book
	 * 
	 * @param book
	 */
	public void createNewBook(Book book) {
		libraryRepo.save(book);
	}

	/**
	 * 
	 * @return Get all my books list
	 */
	public List<Book> allBooks() {
		List<Book> books = new ArrayList<Book>();
		libraryRepo.findAll().forEach(books1 -> books.add(books1));
		return books;
	}

}
