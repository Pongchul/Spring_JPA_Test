package hello.jpa;

import javax.persistence.Persistence;

public class JpaMain {

    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("hello");
    }
}
