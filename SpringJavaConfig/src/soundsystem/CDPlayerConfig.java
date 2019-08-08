package soundsystem;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration			//表明该类是一个配置类

@ComponentScan			//不带参数时会默认扫描该配置类所在的包以及子包
//@ComponentScan(basePackages= {"soundsystem",""})		要扫描多个包时

public class CDPlayerConfig {

}
