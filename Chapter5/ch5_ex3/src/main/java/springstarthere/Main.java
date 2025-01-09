package springstarthere;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import springstarthere.config.ProjectConfig;

public class Main {
    public static void main( String[] args ) {

        // import springstarthere.config.ProjectConfig;
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

    }
}