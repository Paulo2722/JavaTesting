package javaTesting;

import DomainEntities.User;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void contructUserTest() {
        User usuari = new User();

        assertTrue(usuari != null);

        assertEquals(usuari.getName(), "Tomeu");
        //assertEquals(usuari.getPassword(), "secret");

        assertTrue(usuari.verifyPassword("secret"));
    }
}
