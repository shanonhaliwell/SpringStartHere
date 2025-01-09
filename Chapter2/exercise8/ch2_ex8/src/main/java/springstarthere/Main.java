package springstarthere;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import config.ProjectConfig;
//import springstarthere.Parrot;

import java.util.function.Supplier;


public class Main {
    public static void main( String[] args ) {

        var context = new AnnotationConfigApplicationContext(Parrot.class);
        
        Parrot x = new Parrot();
        x.setName("Kiki");


        // import java.util.function.Supplier;
        // A Supplier (for the Parrot bean)  is created to provide the Parrot instance when requested
        Supplier<Parrot> parrotSupplier = () -> x;  // functional Supplier return Parrot x


        /*
        context.registerBean("parrot",
                            Parrot.class,
                            parrotSupplier);  // parrotSupplier supplies the Parrot instance x
        */


        
        context.registerBean("parrot",
                            Parrot.class,
                            parrotSupplier,  // parrotSupplier supplies the Parrot instance x
                            bc -> bc.setPrimary(true));  // the lambda expression sets the bean as the
                            // primary bean of its type (type Parrot.class) in the context        
        


        System.out.println("testing");

        Parrot p = context.getBean(Parrot.class);

        System.out.println("p.getName() is  " + p.getName());

        System.out.println("done testing");


        context.close();


    }

}