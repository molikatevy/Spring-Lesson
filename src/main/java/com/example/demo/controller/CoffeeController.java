package com.example.demo.controller;

import com.example.demo.domain.Coffee;
import com.example.demo.dto.CoffeeResponse;
import com.example.demo.service.CoffeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/coffees")
public class CoffeeController {
    private final CoffeeService coffeeService;

    public CoffeeController(CoffeeService coffeeService){
        this.coffeeService =coffeeService;
    }



    @GetMapping
    public List<CoffeeResponse> getCoffee(){
        return coffeeService.getCoffee();
    }
}
