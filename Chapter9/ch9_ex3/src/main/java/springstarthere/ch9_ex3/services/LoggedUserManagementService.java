package springstarthere.ch9_ex3.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
public class LoggedUserManagementService {

    // instance variable
    private String usernameForSessionScope;

    // setter method
    public void setUsername(String usernameForSessionScope) {
        this.usernameForSessionScope = usernameForSessionScope;
    }
    
    // getter method
    public String getUsername() { return this.usernameForSessionScope; }


}