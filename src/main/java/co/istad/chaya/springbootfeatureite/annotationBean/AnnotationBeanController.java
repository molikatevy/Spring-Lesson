package co.istad.chaya.springbootfeatureite.annotationBean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController
public class AnnotationBeanController {

//    Declare reference dependency (required)
//    key "final" refers to required dependency
    private final AnnotationBeans bean1;
    private final AnnotationBeans bean2;


//    optional dependency
    private AnnotationBeans beans3;

    @Autowired
    public void setBeans3(@Qualifier("China") AnnotationBeans beans3){
        this.beans3 = beans3;
    }
//    inject Dependency (Required)
    public AnnotationBeanController(@Qualifier("Cambodia") AnnotationBeans beans1,
                                   @Qualifier("China") AnnotationBeans beans2){
        this.bean1 = beans1;
        this.bean2 =beans2;
    }
    @GetMapping("/beans")
    public Map<String, Object> getBeans(){
       bean1.setName("koko");
       bean2.setName("sok na");
       beans3.setName("tola");
        return Map.of("beans1",bean1,"bean2",bean2,"beans3",beans3);
    }
}
