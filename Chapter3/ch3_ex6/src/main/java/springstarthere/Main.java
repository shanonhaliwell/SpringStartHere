package springstarthere;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springstarthere.beans.Person;
//import springstarthere.beans.Parrot;
import springstarthere.config.ProjectConfig;

public class Main {
    public static void main( String[] args ) {
        
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);

        System.out.println("Person with name  " + person.getName() + " has a parrot name  " + 
                            person.getParrot().getName());
        
    }
}