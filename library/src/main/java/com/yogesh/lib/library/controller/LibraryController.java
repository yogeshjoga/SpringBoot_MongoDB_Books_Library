package com.yogesh.lib.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yogesh.lib.library.model.Book;
import com.yogesh.lib.library.repo.LibraryRepo;
import com.yogesh.lib.library.service.LibraryServiceImp;

@RestController
public class LibraryController {

	@Autowired(required = false)
	LibraryRepo libraryRepo;

	@Autowired
	LibraryServiceImp libraryServiceImp;

	/**
	 * Create new book or Add new Book to database
	 * 
	 * @param book
	 * @return Response
	 */

	@PostMapping("/createbook")
	private ResponseEntity<Book> createBook(@RequestBody Book book) {
		libraryServiceImp.createNewBook(book);
		return ResponseEntity.ok().build();
	}

	/**
	 * 
	 * @param book
	 * @return Response
	 * 
	 *         Update book -- if any modifications
	 * 
	 */

	@PutMapping("/updatebook")
	private ResponseEntity<Book> updatebook(@RequestBody Book book) {
		libraryServiceImp.createNewBook(book);
		return ResponseEntity.ok().build();

	}

	/**
	 * 
	 * @return list of Books get all books with genres
	 */
	@GetMapping("/getgeners")
	private List<Book> getGeners() {
		return libraryServiceImp.allBooks();
	}

	/**
	 * 
	 * @param genresType
	 * @return book by genres Type
	 */
	@GetMapping("/book/{genresType}")
	private List<Book> getGenres(@PathVariable("genresType") String genresType) {
		return libraryRepo.getBooksByAuthor(genresType);
	}

}
