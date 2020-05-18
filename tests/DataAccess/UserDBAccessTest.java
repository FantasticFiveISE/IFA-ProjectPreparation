package DataAccess;

import domain.User;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class UserDBAccessTest {
    User user;
    UserDBAccess userDBAccess;

    @BeforeEach
    public void insertBeforeTest() {
        user = new User("UserName_1", "Name_1", "Password_1", "TestMail@gmail.com");
        userDBAccess = UserDBAccess.getInstance();
    }

    @AfterEach
    public void deleteAfterTest(){
        user = null;
    }

    @Test
    public void save() {
        user = new User("UserName_1", "Name_1", "Password_1", "TestMail@gmail.com");
        userDBAccess = UserDBAccess.getInstance();
        userDBAccess.save(user);
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void select() {
    }
}