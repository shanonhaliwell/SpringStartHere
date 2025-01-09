package springstarthere;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(Parrot.class);
        
        var p = context.getBean(Parrot.class);
        System.out.println(p.getName());
        p.init();
        System.out.println(p);

    }
}
