package com.example.demo.controller;

import com.example.demo.domain.Coffee;
import com.example.demo.dto.CoffeeResponse;
import com.example.demo.dto.CreateResquest;
import com.example.demo.dto.UpdateCoffeeRequest;
import com.example.demo.service.CoffeeService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/coffees")
public class CoffeeController {
    private final CoffeeService coffeeService;

    public CoffeeController(CoffeeService coffeeService){
        this.coffeeService =coffeeService;
    }


    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public CoffeeResponse deleteCoffeeById(@PathVariable Integer id){
        return coffeeService.deleteCoffeeByID(id);

    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/add")
    public CoffeeResponse CreateCoffee(@Valid @RequestBody CreateResquest createResquest){
        return coffeeService.addCoffee(createResquest);


    }

    @PutMapping("/{id}")
    public CoffeeResponse updateCoffeeById(
            @PathVariable Integer id,
            @Valid @RequestBody UpdateCoffeeRequest updateCoffeeRequest
            ){
        return coffeeService.updateCoffeeByID(id,updateCoffeeRequest);

    }

    @GetMapping
    public List<Coffee> getCoffee(){
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
           @RequestParam(required = false, defaultValue = "0") BigDecimal price
    ){
        log.info("@Get name: {}",name);
        log.info("@Get price: {}",price);
        return coffeeService.searchCoffeeByName(name,price);
    }
}
