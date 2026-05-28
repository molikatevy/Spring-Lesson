package com.example.demo.controller;

import com.example.demo.dto.CoffeeResponse;
import com.example.demo.service.CoffeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
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

    @GetMapping("/{id}")
    public List<CoffeeResponse> getCoffeeById(@PathVariable Integer id){
        log.info("@Get id: {}",id);
//        coffeeService.getCoffee()
//                .stream()
//                .filter(Coffee -> Coffee.equals(id))
//                .map(CoffeeService -> coffeeService.getCoffee())
//                .toList();



        return coffeeService.getCoffeeById(id);
    }

    @GetMapping("/search")
    public List<CoffeeResponse> searchCoffeeByName(
           @RequestParam(required = false, defaultValue = "") String name,
           @RequestParam(required = false, defaultValue = "0") Double price
    ){
        log.info("@Get name: {}",name);
        log.info("@Get price: {}",price);
        return coffeeService.searchCoffeeByName(name);
    }
}
