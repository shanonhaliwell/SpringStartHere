/**
 * Define custom annotation ToLog to mark which method should be intercepted by LoggingAspect
 */

package springstarthere.aspects;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)  // Enables the annotation to be intercepted at runtime
@Target(ElementType.METHOD)  // restricts this annotation to onlye be used with methods
public @interface ToLog {

}