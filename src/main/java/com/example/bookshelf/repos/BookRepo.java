package com.example.bookshelf.repos;

import com.example.bookshelf.domain.BookEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepo extends CrudRepository<BookEntity, Integer> {
    List<BookEntity> findBookByName(String name);
}
