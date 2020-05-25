package aobai.payment;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(basePackages={"com.aobai.user.mapper"})
public class CashLoadsPaymentApplication {
	public static void main(String[] args) {
		SpringApplication.run(CashLoadsPaymentApplication.class, args);
	}
}
