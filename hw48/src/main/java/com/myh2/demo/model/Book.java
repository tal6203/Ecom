package com.myh2.demo.model;

import org.springframework.data.annotation.Id;

public record Book(@Id Integer id,String title, Integer pages, String Author,Integer price) {
}


