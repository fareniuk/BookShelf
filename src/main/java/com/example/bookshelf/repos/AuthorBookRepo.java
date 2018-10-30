package com.example.bookshelf.repos;

import com.example.bookshelf.domain.AuthorBookEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuthorBookRepo extends CrudRepository<AuthorBookEntity, Integer> {
  //  List<AuthorBookEntity> findByBookId(Integer bookid);
   // List<AuthorBookEntity> findByAuthorId(Integer authorid);
}

