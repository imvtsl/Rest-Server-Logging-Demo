package com.vatsal.project.serverloggingdemo.controller;

import com.vatsal.project.serverloggingdemo.dto.Author;
import com.vatsal.project.serverloggingdemo.service.AuthorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Validated
@RestController
@RequestMapping(value = "/v1/author", produces = MediaType.APPLICATION_JSON_VALUE)
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @PostMapping(value = "/")
    public ResponseEntity<Author> createAuthor(@RequestBody Author author) {
        return ResponseEntity.ok(authorService.createAuthor(author));
    }
}
