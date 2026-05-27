package com.example.demo.service.impl;

import com.example.demo.domain.Coffee;
import com.example.demo.dto.CoffeeResponse;
import com.example.demo.repository.CoffeeRepository;
import com.example.demo.service.CoffeeService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CoffeeServiceImpl implements CoffeeService {

    private final CoffeeRepository coffeeRepository;
    public CoffeeServiceImpl (CoffeeRepository coffeeRepository){

        this.coffeeRepository = coffeeRepository;
    }

    @Override
    public List<CoffeeResponse> getCoffee(){
        List<Coffee> coffees = coffeeRepository.BeanCoffee();
        return coffees.stream()
                .filter((a)-> a.getId() >1)
                .map((a)->new CoffeeResponse(a.getName(), a.getDescription()))
                .toList();
    }
    }

