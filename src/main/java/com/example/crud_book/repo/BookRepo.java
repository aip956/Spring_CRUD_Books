package com.example.crud_book.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo implements JpaRepository<Book, Long>{
}
