package springstarthere.aspects;

import java.util.logging.Logger;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
@Aspect  // the @Aspect annotation is NOT a stereotype annotation
public class LoggingAspect {

    // instance variable
    //private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
    private Logger logger;

    
    // constructor
    public LoggingAspect() {
        System.out.println("LoggingAspect created");
        logger = Logger.getLogger("some testing");
    }
    

    // Define a method to implement the aspect logic
    // then use advice annotation to tell Spring when and what to intercept
    @Around("execution(* springstarthere.services.*.*(..))")
    public Object log(ProceedingJoinPoint  joinPoint) throws Throwable {
        
        String methodName = joinPoint.getSignature().getName();

        Object [] arguments = joinPoint.getArgs();

        // before intercepted method's execution
        logger.info("The Intercepted Method  " + methodName + "()  with parameters  " +
                    Arrays.asList(arguments) + "  is about to be executed");
        

        // implement aspect logic to call the intercepted method
        Object returnByMethod = joinPoint.proceed();  // Delegates to the actual intercepted method

        logger.info("Method executed and returned  " + returnByMethod);

        return returnByMethod;

    }


}
