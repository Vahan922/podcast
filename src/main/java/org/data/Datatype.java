package org.data;

import org.Role;

import java.util.List;

public abstract class Datatype {

    protected final String message;
    protected List<Role> roles;

    public Datatype(String message) {
        this.message = message;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Datatype{" +
                "roles=" + roles +
                ", message='" + message + '\'' +
                '}';
    }

    public static class PublicData extends Datatype {
        public PublicData(String message) {
            super(message);
            roles = List.of(Role.ADMIN, Role.QA, Role.USER);
        }
    }

    public static class SensitiveData extends Datatype {
        public SensitiveData(String message) {
            super(message);
            roles = List.of(Role.ADMIN, Role.QA);
        }
    }

    public static class SpecificData extends Datatype {

        public SpecificData(String message) {
            super(message);
            roles = List.of(Role.ADMIN, Role.USER);
        }
    }

}
