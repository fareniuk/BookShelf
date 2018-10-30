package com.example.bookshelf.repos;

import com.example.bookshelf.domain.AuthorEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuthorRepo extends CrudRepository<AuthorEntity, Integer> {
    List<AuthorEntity> findByName(String name);
}