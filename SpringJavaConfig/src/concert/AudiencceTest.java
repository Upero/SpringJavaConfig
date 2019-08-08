package concert;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(classes=ConcertConfig.class)
public class AudiencceTest {

	
	@Autowired
	Performance per ;
	
	@Test
	public void testAudience() {
		per.perform("hello");
	}
}
