package org;

import org.data.Datatype;

public class Main {
    public static void main(String[] args) {

        User admin = new User("Admin", Role.ADMIN);
        User qa = new User("QA", Role.QA);
        User user = new User("User", Role.USER);


        Datatype publicData = new Datatype.PublicData("This is public data");
        Datatype sensitiveData = new Datatype.SensitiveData("This is sensitive data");
        Datatype specificData = new Datatype.SpecificData("This is specific data");

        admin.accessData(publicData);
        admin.accessData(sensitiveData);
        admin.accessData(specificData);

        System.out.println("-----------------------------------------------------------------------");

        qa.accessData(publicData);
        qa.accessData(sensitiveData);
        qa.accessData(specificData);

        System.out.println("-----------------------------------------------------------------------");


        user.accessData(publicData);
        user.accessData(sensitiveData);
        user.accessData(specificData);
    }
}