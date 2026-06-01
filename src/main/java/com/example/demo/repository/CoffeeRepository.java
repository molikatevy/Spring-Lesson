package com.example.demo.repository;

import com.example.demo.domain.Coffee;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CoffeeRepository {

//    @Bean
//    public List<Coffee> BeanCoffee(){
//        List<Coffee> coffees = new ArrayList<>();
//        Coffee coffee = new Coffee(1,"hot latte","100%", BigDecimal.valueOf(90.2));
//        Coffee coffee1 = new Coffee(2,"milk tea","10%",BigDecimal.valueOf(4.2));
//        Coffee coffee2 = new Coffee(3,"macha","100%",BigDecimal.valueOf(5.3));
//        coffees.add(coffee);
//        coffees.add(coffee1);
//        coffees.add(coffee2);
//
////        return new ArrayList<>(List.of(coffee1,coffee2,coffee));
//
//        return coffees;
//    }

private final List<Coffee> coffees;

    public CoffeeRepository() {
        this.coffees = new ArrayList<>();
        Coffee coffee = new Coffee(1, "Ice Latte", "50%", BigDecimal.valueOf(5000));
        Coffee coffee2 = new Coffee(2, "Hot Latte", "50%", BigDecimal.valueOf(4500));
        Coffee coffee3 = new Coffee(3, "Ice Americano", "100%", BigDecimal.valueOf(4000));

        coffees.add(coffee);
        coffees.add(coffee2);
        coffees.add(coffee3);
    }

    public List<Coffee> getCoffees() {
        return coffees;
    }



}
