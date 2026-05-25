package co.istad.chaya.springbootfeatureite.assigment1;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
public class Coffee {
    private String name;
    private Double price;
    private Boolean isValidate;
}
