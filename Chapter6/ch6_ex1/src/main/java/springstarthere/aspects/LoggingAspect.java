package springstarthere.aspects;

import java.util.logging.Logger;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

//@Component
@Aspect  // the @Aspect annotation is NOT a stereotype annotation
public class LoggingAspect {

    // instance variable
    private Logger logger;

    // constructor
    public LoggingAspect() {
        logger = Logger.getLogger(LoggingAspect.class.getName());
    }

    // Define a method to implement the aspect logic
    // then use advice annotation to tell Spring when and what to intercept
    @Around("execution(* springstarthere.services.*.*(..))")
    public void log(ProceedingJoinPoint  joinPoint) throws Throwable {
        
        // before intercepted method's execution
        logger.info("The Intercepted Method is about to be executed");
        
        // implement aspect logic to call the intercepted method
        joinPoint.proceed();  // Delegates to the actual intercepted method

        logger.info("Method executed");

    }


}
