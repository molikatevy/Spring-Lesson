package co.istad.chaya.springbootfeatureite.assigment1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class CoffeeController {
    private final CoffeeConfig coffeeList;

    @Autowired
    public CoffeeController (CoffeeConfig coffeeList){
        this.coffeeList  = coffeeList;
    }


    @GetMapping("/api/coffee")
    public List<Coffee> getCoffee(){
        return coffeeList.coffeeList();
    }
}
