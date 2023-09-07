package com.myh2.demo.repository;

import com.myh2.demo.model.Book;
import com.myh2.demo.model.ProductOrders;
import org.springframework.data.repository.CrudRepository;

public interface ProductOrderRepository extends CrudRepository<ProductOrders, Integer> {
}
