package springstarthere.aspects;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.springframework.stereotype.Component;


//@Component
@Aspect
public class SecurityAspect {

    // instance variable
    private Logger logger;

    // constructor
    public SecurityAspect() {
        System.out.println("SecurityAspect created");
        logger = Logger.getLogger(SecurityAspect.class.getName());
    }

    @Around(value = "@annotation(ToLog)")
    public Object secure (ProceedingJoinPoint joinPoint) throws Throwable {

        logger.info("Security Aspect:  Calling the intercepted method");

        Object returnedValue = joinPoint.proceed();

        logger.info("Security Aspect:  Method executed and returned  " + returnedValue);

        return returnedValue;


    }

}