package aobai.user;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@MapperScan(basePackages={"com.aobai.user.mapper"})
@EnableSwagger2
public class CashLoadsUserApplication {
	public static void main(String[] args) {
		SpringApplication.run(CashLoadsUserApplication.class, args);
	}
}
