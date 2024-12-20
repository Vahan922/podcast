package org;

import lombok.extern.log4j.Log4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.data.Datatype;
import org.data.UnauthorizedException;

import java.util.List;
@Log4j
public class User {
    public static final String SIGN_UP = "https://podcastle.ai/editor/signup";
    private static final Logger log = LogManager.getLogger(User.class);


    private static int counter = 1;

    private final int id;
    private final String name;
    private final Role role;


    public User(String name, Role role) {
        this.id = counter++;
        this.role = role;
        this.name = name;
    }

    public <T extends Datatype> void accessData(T data) {
        try {
            if (hasPermission(data.getRoles())) {
                log.info("{} user print: {}", this.name, data.getMessage());
                log.info("{} user print: {}", data.toString(), data.getMessage());
            } else {
                throw (new UnauthorizedException("The " + this.role.permissions.values() + " but doesn't have access to modify "
                        + data.getClass().getSimpleName() + " {" + role.description + " }"));
            }
        } catch (UnauthorizedException e) {
         System.out.println("information closed for you " + " MR/MS " + this.name + " jan !! please SIGN_UP on " + SIGN_UP + " and connect with ADMIN to get correct role for access Data");
            log.error("Information closed for you, MR/MS {}. Please SIGN_UP on {} and connect with ADMIN to get the correct role for access to Data.",
                    this.name, SIGN_UP);
        }
    }

    public boolean hasPermission(List<Role> roles) {
        return roles.contains(this.role);
    }

}



