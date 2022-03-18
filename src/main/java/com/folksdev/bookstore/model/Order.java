package com.folksdev.bookstore.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Table
@Data
@Getter
@Setter
@Builder
@Entity(name = "bookOrder")
public class Order {
    @Id
    private Integer id;

    private String userName;

    private List<Integer> bookList;

    private Double totalPrice;
}
