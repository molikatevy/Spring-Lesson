package com.example.demo.service;

import com.example.demo.dto.CoffeeResponse;

import java.util.List;

public interface CoffeeService {
    List<CoffeeResponse> getCoffee();
    List<CoffeeResponse> getCoffeeById(Integer id);
    List<CoffeeResponse> searchCoffeeByName(String name);

}
