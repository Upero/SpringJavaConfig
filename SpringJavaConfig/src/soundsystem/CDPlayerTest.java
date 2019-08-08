package soundsystem;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = CDPlayerConfig.class)

//@SpringJUnitConfig(classes=CDPlayerConfig.class)			//Junit5配置方法

@SpringJUnitConfig(locations="CDPlayercontext.xml")	//使用xml方式进行包扫描,不带/指去本包下面去找
public class CDPlayerTest {
	@Autowired
	private CompactDisc cd ;
	@Test
	public void cdShouldNotBeNull() {
		cd.play();
	}
	
	
}
