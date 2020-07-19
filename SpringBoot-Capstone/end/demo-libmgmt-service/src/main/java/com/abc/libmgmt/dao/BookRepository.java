package com.abc.libmgmt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.libmgmt.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
