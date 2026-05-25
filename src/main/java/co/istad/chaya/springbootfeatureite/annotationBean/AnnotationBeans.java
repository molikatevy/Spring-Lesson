package co.istad.chaya.springbootfeatureite.annotationBean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@Scope("prototype")
public class AnnotationBeans {

    private String name;

//    public String getName(){
//        return name;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }
}
