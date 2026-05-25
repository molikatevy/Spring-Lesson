package co.istad.chaya.springbootfeatureite.assigment1;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class CoffeeConfig {


    @Bean("milk tea")
    public Coffee coffee1(){
        Coffee coffee = new Coffee();
        coffee.setName("milk tea");
        coffee.setPrice(2.3);
        coffee.setIsValidate(true);
        return coffee;
    }

    @Bean("hot-coffee")
    public Coffee coffee2(){
        Coffee coffee = new Coffee();
        coffee.setName("hot coffee");
        coffee.setPrice(2.3);
        coffee.setIsValidate(false);
        return coffee;
    }

    @Bean("Ice late")
    public Coffee coffee3(){
        Coffee coffee = new Coffee();
        coffee.setName("Ice late");
        coffee.setPrice(2.3);
        coffee.setIsValidate(true);
        return coffee;
    }

   @Bean
    public List<Coffee> coffeeList(){
        return List.of(coffee1(),coffee2(),coffee3());
   }


}
