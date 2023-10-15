package com.example.crud_book.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.*;


@Entity
@Table(name="Books")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Book {
    // Create, update, view,delete
    private Long id;
    private String title;
    private String author;

}
