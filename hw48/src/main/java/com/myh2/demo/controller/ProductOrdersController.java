package com.myh2.demo.controller;

import com.myh2.demo.model.Book;
import com.myh2.demo.model.ProductOrders;
import com.myh2.demo.repository.ProductOrderRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductOrdersController {
    private final ProductOrderRepository productOrderRepository;


    public ProductOrdersController(ProductOrderRepository productOrderRepository) {
        this.productOrderRepository = productOrderRepository;
    }

    @GetMapping(value = "/productOrders")
    public Iterable<ProductOrders> findall() {
        return productOrderRepository.findAll();
    }

    @PostMapping(value = "/productOrders")
    public ProductOrders post(ProductOrders productOrders){
        return productOrderRepository.save(productOrders);
    }

    @GetMapping("/productOrders/{id}")
    public ProductOrders getById(@PathVariable(value = "id") int id){
        return productOrderRepository.findById(id).get();
    }

    @PutMapping("/productOrders/{id}")
    public  ProductOrders put(@PathVariable(value = "id") int id,@RequestBody ProductOrders productOrdersDetails) {
        return productOrderRepository.save(productOrdersDetails);
    }

    @DeleteMapping("/productOrders/{id}")
    public void deleteBook(@PathVariable(value = "id") int id){
        ProductOrders book = productOrderRepository.findById(id).get();
        productOrderRepository.delete(book);
    }
}
