package springstarthere;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;


public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Parrot.class);

        //Parrot p = context.getBean("parrotBean", Parrot.class);
        Parrot p = context.getBean(Parrot.class);
        
        System.out.println(p.getName());

    }
}