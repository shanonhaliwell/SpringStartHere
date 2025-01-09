package springstarthere.ch9_ex3.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@Service
@ApplicationScope
public class LoginCountService {

    // instance variable
    private int count;

    //methods
    public void increment() { 
        this.count++;
    }
    
    public int getCount() { return this.count; }

}