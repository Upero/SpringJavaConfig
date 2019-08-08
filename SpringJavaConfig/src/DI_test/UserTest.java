package DI_test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations="user.xml")
public class UserTest {
	
	@Autowired
	User user;
	@Test
	public void testUser() {
		System.out.println(user);
	}

}
