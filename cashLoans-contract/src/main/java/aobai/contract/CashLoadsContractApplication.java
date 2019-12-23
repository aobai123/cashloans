package aobai.contract;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@MapperScan(basePackages={"com.aobai.user.mapper"})
@EnableSwagger2
public class CashLoadsContractApplication {
	public static void main(String[] args) {
		SpringApplication.run(CashLoadsContractApplication.class, args);
	}
}
