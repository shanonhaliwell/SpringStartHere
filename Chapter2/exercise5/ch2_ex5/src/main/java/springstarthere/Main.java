package springstarthere;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;


public class Main {

    public static void main( String[] args ) {

        // create an instance of the Spring context
        // add dependency spring-context
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //Parrot p = context.getBean("parrot2", Parrot.class);

        Parrot p1 = context.getBean("bean1", Parrot.class);
        Parrot p2 = context.getBean("name2", Parrot.class);
        Parrot p3 = context.getBean("parrot3", Parrot.class);

        System.out.println(p1.getName() + " " + p2.getName() + " " + p3.getName());

        Parrot primaryP = context.getBean(Parrot.class);
        System.out.println(primaryP.getName());


        String s = context.getBean(String.class);
        System.out.println(s);

        Integer n = context.getBean(Integer.class);
        System.out.println(n);


        /*
        Parrot p = new Parrot();
        System.out.println(p);
        */


    }
    
}