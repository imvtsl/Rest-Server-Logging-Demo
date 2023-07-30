package com.vatsal.project.serverloggingdemo.service;

import com.vatsal.project.serverloggingdemo.dto.Author;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class AuthorService {
    List<Author> authorList;

    @PostConstruct
    private void postConstruct() {
        this.authorList = new ArrayList<>();
    }

    public Author createAuthor(Author author) {
        int size = authorList.size();
        author.setId(size+1);
        authorList.add(author);
        return author;
    }
}
