package aobai.message;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(basePackages={"com.aobai.user.mapper"})
public class CashLoadsMessageApplication {
	public static void main(String[] args) {
		SpringApplication.run(CashLoadsMessageApplication.class, args);
	}
}
