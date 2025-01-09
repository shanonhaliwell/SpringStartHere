package springstarthere.ch9_ex1.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope  // Spring creates a new instance of the class for every HTTP request
public class LoginProcessor {

    // instannce variable
    // the bean stores the credentials as attributes
    private String usernameFromUser;
    private String passwordFromUser;

    public boolean credentialLoginValidation() {

        /*
        String usernameFromUser = this.getUsername();
        String passwordFromUser = this.getPassword();
        */

        String usernameFromDB = "natalia";
        String passwordFromDB = "nopassword";

        System.out.println("input username from user:  " + this.usernameFromUser);
        System.out.println("input password from user:  " + this.passwordFromUser);

        if ( this.usernameFromUser.toLowerCase().equals(usernameFromDB) && 
                this.passwordFromUser.toLowerCase().equals(passwordFromDB) ) {

            return true;
        } else {
            return false;
        }
    }

    // getter method
    public String getUsername() { return this.usernameFromUser; }

    public String getPassword() { return this.passwordFromUser; }

    // setter method
    public void setUsername(String usernameFromUser) { this.usernameFromUser = usernameFromUser; }

    public void setPassword(String passwordFromUser) { this.passwordFromUser = passwordFromUser; }

}
