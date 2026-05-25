package co.istad.chaya.springbootfeatureite.annotationBean;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassBeansConfig {

    @Bean("China")
    public AnnotationBeans beans1(){
        AnnotationBeans beans = new AnnotationBeans();
        beans.setName("China");
        return beans;
    }
    @Bean("Cambodia")
    public AnnotationBeans beans2(){
        AnnotationBeans beans = new AnnotationBeans();
        beans.setName("Cambodia");
        return beans;
    }
}
