package com.example.demo.service;

import com.example.demo.domain.Coffee;
import com.example.demo.dto.CoffeeResponse;
import com.example.demo.dto.CreateResquest;
import com.example.demo.dto.UpdateCoffeeRequest;

import java.math.BigDecimal;
import java.util.List;

public interface CoffeeService {
    List<Coffee> getCoffee();
    List<CoffeeResponse> getCoffeeById(Integer id);
    List<CoffeeResponse> searchCoffeeByName(String name, BigDecimal price);
//    1. Expected result (return type: void ,object, collection, int..)
//    2. your Logic add single coffee
//    3. Paramater are used for
    CoffeeResponse addCoffee(CreateResquest createResquest);
    CoffeeResponse updateCoffeeByID(Integer id,UpdateCoffeeRequest updateCoffeeRequest);
    CoffeeResponse deleteCoffeeByID(Integer id);

}
