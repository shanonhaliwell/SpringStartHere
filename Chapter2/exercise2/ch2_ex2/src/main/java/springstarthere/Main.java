package springstarthere;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;


public class Main 
{
    public static void main( String[] args ) {
        
        System.out.println( "Hello World!" );

        // create an instance of the Spring context
        // add dependency spring-context
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());

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