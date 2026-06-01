package com.example.demo.service.impl;

import com.example.demo.domain.Coffee;
import com.example.demo.dto.CoffeeResponse;
import com.example.demo.dto.CreateResquest;
import com.example.demo.repository.CoffeeRepository;
import com.example.demo.service.CoffeeService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Service

public class CoffeeServiceImpl implements CoffeeService {

    private final CoffeeRepository coffeeRepository;
    private final List<Coffee> coffeeBean;
    public CoffeeServiceImpl (CoffeeRepository coffeeRepository, List<Coffee> coffeeBean){

        this.coffeeRepository = coffeeRepository;
        this.coffeeBean = coffeeBean;
    }

    @Override
    public List<Coffee> getCoffee(){

        return coffeeBean;
    }

    @Override
    public List<CoffeeResponse> getCoffeeById(Integer id) {
        return Collections.singletonList(coffeeRepository.getCoffees()
                .stream()
                .filter(coffee -> coffee.getId().equals(id))
                .map(coffee -> new CoffeeResponse(coffee.getId(), coffee.getName(), coffee.getDescription()))
                .findFirst()
                .orElseThrow());


    }

    @Override
    public List<CoffeeResponse> searchCoffeeByName(String name, BigDecimal price) {
//        return coffeeRepository.BeanCoffee()
//                .stream()
//                .filter((a) -> a.getName().toLowerCase().contains(name.toLowerCase().trim()))
//                .map((a) -> new CoffeeResponse(a.getName(), a.getDescription(), a.getPrice()))
//                .toList();

        return coffeeRepository.getCoffees().stream()
                //.filter(coffee -> coffee.getId() > 3)
                .map(coffee -> new CoffeeResponse(coffee.getId(), coffee.getName(),coffee.getDescription()))
                .toList();
    }

    @Override
    public CoffeeResponse addCoffee(CreateResquest createResquest) {
        Coffee coffee =new Coffee();
        coffee.setId(new Random().nextInt(6));  //System Generate Data
        coffee.setName(createResquest.name());
        coffee.setDescription(createResquest.description());
        coffee.setPrice(BigDecimal.valueOf(createResquest.price()));


        boolean isExisting = coffeeRepository.getCoffees()
                .stream()
                .anyMatch(c -> c.getId().equals(coffee.getId()));

        if (isExisting) {
            throw new RuntimeException("Coffee ID already exists");
        }

        coffeeRepository.getCoffees().add(coffee);
        return new CoffeeResponse(coffee.getId(), coffee.getName(), coffee.getDescription());
    }


}

