package springstarthere;

// Importing required classes
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 
// Main class
public class Main {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Using AnnotationConfigApplicationContext
        // instead of ClassPathXmlApplicationContext
        // Because we are not using XML Configuration
        ApplicationContext context
            = new AnnotationConfigApplicationContext(
                CollegeConfig.class);
 
        // Get the bean and storing it in
        // a object of College class type
        College college
            = context.getBean("collegeBean", College.class);
 
        // Invoking the method
        // inside main() method
        college.test();
    }
}
