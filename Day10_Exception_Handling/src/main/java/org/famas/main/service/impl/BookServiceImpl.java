package org.famas.main.service.impl;

import org.famas.main.model.Book;
import org.famas.main.repository.BookRepository;
import org.famas.main.service.BookService;
import org.jdbi.v3.core.Jdbi;
import org.springframework.stereotype.Service;
@Service
public class BookServiceImpl implements BookService {
	BookRepository repo;
	Jdbi jdbi;
	

	public BookServiceImpl( Jdbi jdbi) {
		//super();
		this.jdbi = jdbi;
		repo = jdbi.onDemand(BookRepository.class);
	}


	@Override
	public Book getBookById(int bookId) {
		return repo.getBookById(bookId);
	}

}
