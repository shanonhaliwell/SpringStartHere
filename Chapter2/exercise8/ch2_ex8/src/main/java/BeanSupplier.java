import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

@Configuration
public class BeanSupplier {
// configuration

    // This bean returns a supplier that provides a new Parrot 
    // instance with the name "Polly".
    @Bean
    public Supplier<Parrot> parrotSupplier() {
        return () -> new Parrot("Polly");
    }

    // This bean gets a Parrot instance from the supplier. 
    @Bean
    public Parrot parrot(Supplier<Parrot> supplier) {
        return supplier.get();
    }


    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanSupplier.class);
        
        Parrot p = context.getBean(Parrot.class);

        System.out.println(p.getName());

        context.close();
    
    }

}


class Parrot {

    private String name;

    public Parrot(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}