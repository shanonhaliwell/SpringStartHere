package springstarthere.repositories;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.config.BeanDefinition;

@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)  // import org.springframework.beans.factory.config.BeanDefinition;
public class CommentRepository {
   
    // constructor
    public CommentRepository() {
        System.out.println("CommentRepository instance created with @Scope Prototype !");
    }
}