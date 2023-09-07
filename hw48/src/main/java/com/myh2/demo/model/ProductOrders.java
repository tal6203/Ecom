package com.myh2.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;




public record ProductOrders(@Id Integer id, String product_name, String customer_name, Integer order_cost, Integer items) {
}
