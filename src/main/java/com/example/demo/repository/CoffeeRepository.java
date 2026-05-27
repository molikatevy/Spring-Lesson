package com.example.demo.repository;

import com.example.demo.domain.Coffee;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CoffeeRepository {

    @Bean
    public List<Coffee> BeanCoffee(){
        Coffee coffee = new Coffee(1,"hot latte","100%");
        Coffee coffee1 = new Coffee(2,"milk tea","10%");
        Coffee coffee2 = new Coffee(3,"macha","100%");
        return new ArrayList<>(List.of(coffee1,coffee2,coffee));

    }
}
