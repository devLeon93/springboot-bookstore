package com.wecode.bookstrore.controller;

import com.wecode.bookstrore.dto.BookDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leonid.barsucovschi
 */

@RestController
@RequestMapping("/api/v1")
public class BookController {

    @GetMapping("/books")
    public ResponseEntity<List<BookDto>> getBooks() {
        BookDto book1 = BookDto.builder()
                .title("My first Book title1")
                .build();
        List<BookDto> bookDtoList = new ArrayList<>();
        bookDtoList.add(book1);
        return new ResponseEntity<>(bookDtoList, HttpStatus.OK);
    }

}
