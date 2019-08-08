package soundsystem1;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
@Configuration			//表明该类是一个配置类
public class CDPlayerConfig {
	
	@Bean			//无参数时Bean的id默认为方法名
	@Qualifier("sgtPeppers")
	//@Bean(name="sgtPeppers")
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}
	
	@Bean
	@Qualifier("anoPeppers")
	@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)					//bean的作用域
	//@Primary                    //首选注解
	public CompactDisc anoPeppers() {
		return new AnoPeppers();
	}
	
	
	@Bean
	@Conditional(MagicExistsCondition.class)//条件类

	public CDPlayer cdPlayer(SgtPeppers cd) {
		CDPlayer cdplayer = new CDPlayer();
		cdplayer.setCd(cd);
		return cdplayer;
	}
	
}
