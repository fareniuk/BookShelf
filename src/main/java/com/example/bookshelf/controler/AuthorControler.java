package com.example.bookshelf.controler;

import com.example.bookshelf.domain.AuthorEntity;
import com.example.bookshelf.repos.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Date;
import java.util.Map;

@Controller
public class AuthorControler {

    @Autowired
    private AuthorRepo authorRepo;

    @GetMapping("/authors")
    public String authors(Map<String, Object> modela) {
        Iterable<AuthorEntity> authors = authorRepo.findAll();

        modela.put("authors", authors);
        return "authors";
    }

    @PostMapping("/authors")
    public String add(@RequestParam Integer author_id,@RequestParam String name,
                      @RequestParam String gender, @RequestParam Date born,
                      Map<String, Object> modela) {
        AuthorEntity author = new AuthorEntity(author_id,name, born, gender);

        authorRepo.save(author);

        Iterable<AuthorEntity> authors = authorRepo.findAll();

        modela.put("authors", authors);
        return "authors";
    }

    @PostMapping("filtera")
    public String filtera(@RequestParam String filtera, Map<String, Object> modela) {
        Iterable<AuthorEntity> authors;
        if (filtera != null && !filtera.isEmpty()) {
            authors = authorRepo.findByName(filtera);
        } else {
            authors = authorRepo.findAll();
        }
        modela.put("authors", authors);
        return "authors";

    }

}
