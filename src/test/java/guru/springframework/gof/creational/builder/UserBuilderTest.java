package guru.springframework.gof.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserBuilderTest {

    @Test
    public void testUserBuilder() {
        User user1 = new User.UserBuilder("Vaibhav", "Dubey")
                                .build();
        System.out.println("User1 : " + user1);

        User user2 = new User.UserBuilder("Vaibhav", "Dubey")
                                .age(29)
                                .build();
        System.out.println("User2 : " + user2);

        User user3 = new User.UserBuilder("Vaibhav", "Dubey")
                                .address("Bangalore")
                                .age(29)
                                .phone("xxxxxxxx23")
                                .build();
        System.out.println("User3 : " + user3);
    }
}