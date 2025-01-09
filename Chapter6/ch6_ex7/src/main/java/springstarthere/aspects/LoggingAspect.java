package springstarthere.aspects;

import java.util.logging.Logger;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.core.annotation.Order;

import org.springframework.stereotype.Component;

import springstarthere.model.Comment;

import java.util.Arrays;

//@Component
@Aspect  // the @Aspect annotation is NOT a stereotype annotation
@Order(2)
public class LoggingAspect {

    // instance variable
    //private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
    private Logger logger;

    
    // constructor
    public LoggingAspect() {
        System.out.println("LoggingAspect created");
        logger = Logger.getLogger("some testing");
    }
    
    @Around(value = "@annotation(ToLog)")
    public Object log (ProceedingJoinPoint joinPoint) throws Throwable {

        logger.info("Logging Aspect: Calling the intercepted method");

        Object returnedValue = joinPoint.proceed();

        logger.info("Logging Aspect:  Method executed and returned  " + returnedValue);

        return returnedValue;

    }


    /**
     * @AfterReturning - Calls the method defining the aspect logic after the method successfully 
     * returns, and provides the returned value as a parameter to the aspect method.
     * The aspect method isn’t called if the intercepted method throws an exception.
     * 
     * In this case, intercepted method deleteComment()  run by annotation ToLog will return returnByMethod
     * then trigger method log(Object returnByMethod) to print out the returnByMethod
     */
    /*
    @AfterReturning(value = "@annotation(ToLog)", returning = "returnByMethod")
    public void log (Object returnByMethod) {

        System.out.println("printing returnByMethod to console:  " + returnByMethod);
        logger.info("@AfterReturning @annotation(ToLog)  -->  Method executed and returned  " + returnByMethod);
        
    }
    */


    /*
    // Define a method to implement the aspect logic
    // then use advice annotation to tell Spring when and what to intercept
    //@Around("execution(* springstarthere.services.*.*(..))")
    //@Around("@annotation(ToLog)")  // weaving the aspect to method annotated with @ToLog
    @AfterReturning(value = "@annotation(ToLog)", returning = "returnByMethod")
    public Object log(ProceedingJoinPoint  joinPoint) throws Throwable {
        
        String methodName = joinPoint.getSignature().getName();

        Object [] arguments = joinPoint.getArgs();

        // before intercepted method's execution
        logger.info("The Intercepted Method  " + methodName + "()  with original parameters  " +
                    Arrays.asList(arguments) + "  is about to be executed");
    
                    
        // implement aspect logic to call the intercepted method
        Object returnByMethod = joinPoint.proceed();  // Delegates to the actual intercepted method
        
        logger.info("Method with original parameters executed and returned  " + returnByMethod+ "\n");

        */


        /*
        Comment newComment = new Comment();
        //newComment.setAuthor("Wendy");
        newComment.setText("Some other text!");
        Object [] newArguments = {newComment};

        logger.info("The Intercepted Method  " + methodName + "()  with a new parameters  " +
                    Arrays.asList(newArguments) + "  is about to be executed");


        // implement aspect logic to call the intercepted method
        returnByMethod = joinPoint.proceed(newArguments);  // Delegates to the actual intercepted method

        logger.info("Method with new parameters executed and returned  " + returnByMethod);
        */

        /*
        //return returnByMethod;
        return "FALSE";

    }
    */


    // setter method
    public void setLogger(Logger logger) { this.logger = logger; }


}
