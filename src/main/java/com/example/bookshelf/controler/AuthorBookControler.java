package com.example.bookshelf.controler;

import com.example.bookshelf.domain.AuthorBookEntity;
import com.example.bookshelf.repos.AuthorBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class AuthorBookControler {
    @Autowired

    private AuthorBookRepo authorBookRepo;

    @GetMapping("/authorbooks")
    public String authorbooks(Map<String, Object> modelab) {
        Iterable<AuthorBookEntity> authorbooks = authorBookRepo.findAll();

        modelab.put("authorbooks", authorbooks);
        return "authorbooks";
    }

    @PostMapping("/authorbooks")
    public String add(@RequestParam Integer ab_id,@RequestParam Integer authorid, @RequestParam Integer bookid,
                      Map<String, Object> modelab) {
        AuthorBookEntity authorbook = new AuthorBookEntity(ab_id,authorid, bookid);

        authorBookRepo.save(authorbook);

        Iterable<AuthorBookEntity> authorbooks = authorBookRepo.findAll();

        modelab.put("authorbooks", authorbooks);
        return "authorbooks";
    }


}
