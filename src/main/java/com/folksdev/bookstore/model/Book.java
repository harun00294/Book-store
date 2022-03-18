package com.folksdev.bookstore.model;

import lombok.*;

import javax.persistence.*;

@Table
@Data
@Getter
@Setter
@Builder
@Entity
public class Book {

    @Id
    private Integer id;

    private String name;

    private String author;

    private double price;

    private Integer stock;
}
