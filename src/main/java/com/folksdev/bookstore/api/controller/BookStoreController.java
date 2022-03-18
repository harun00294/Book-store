package com.folksdev.bookstore.api.controller;

import com.folksdev.bookstore.dto.BookOrderRequest;
import com.folksdev.bookstore.model.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.folksdev.bookstore.service.OrderService;

@RestController
@RequestMapping("/v1/bookstore")
public class BookStoreController {

    private final OrderService orderService;

    public BookStoreController(OrderService orderService) {
        this.orderService = orderService;
    }


    @GetMapping
    public ResponseEntity<String> helloTwitch(){
        return ResponseEntity.ok("Hello Twitch");
    }

    @PostMapping
    public ResponseEntity<Order> putAnOrder(@RequestBody BookOrderRequest bookOrderRequest){
        Order order = orderService.putAnOrder(bookOrderRequest.getBookIdList(),bookOrderRequest.getUserName());

        return ResponseEntity.ok(order);
    }
}
