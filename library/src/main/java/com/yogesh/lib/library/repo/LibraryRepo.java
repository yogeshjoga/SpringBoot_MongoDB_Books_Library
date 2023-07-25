package com.yogesh.lib.library.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;



import com.yogesh.lib.library.model.Book;

/**
 * Extends the Mongo Repository 
 * Declaring the abstract methods to implement into service class
 * 
 */
public interface LibraryRepo extends MongoRepository<Book, Integer>{
	
	/**
	 * 
	 * @param genresType
	 * @return filter the GenresType Books
	 */
	  @Query("{genresType : ?0}")                                        
      List<Book> getBooksByAuthor(String genresType);
}
