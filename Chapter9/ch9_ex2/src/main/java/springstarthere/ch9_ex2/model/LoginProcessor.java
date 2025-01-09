package springstarthere.ch9_ex2.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import springstarthere.ch9_ex2.services.LoggedUserManagementService;

@Component
@RequestScope
public class LoginProcessor {

    // instance variable
    // the bean stores the credentials as attributes
    private String usernameFromUser;
    private String passwordFromUser;

    private final LoggedUserManagementService loggedUserManagementService;

    // constructor
    public LoginProcessor (LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }

    public boolean loginCredentialValidation() {

        /*
        String usernameFromUser = this.getUsername();
        String passwordFromUser = this.getPassword();
        */

        String usernameFromDB = "natalia";
        String passwordFromDB = "nopassword";

        boolean loginResult = false;

        if ( this.usernameFromUser.equals(usernameFromDB) 
            && this.passwordFromUser.equals(passwordFromDB) ) {
            
            loginResult = true;

            // 
            loggedUserManagementService.setUsername(usernameFromUser);

        }

        return loginResult;

    }

    // getter method
    public String getUsername() { return this.usernameFromUser; }

    public String getPassword() { return this.passwordFromUser; }

    // setter method
    public void setUsername(String usernameFromUser) { this.usernameFromUser = usernameFromUser; }

    public void setPassword(String passwordFromUser) { this.passwordFromUser = passwordFromUser; }

}