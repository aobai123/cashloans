package cmo.aobai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo-conf/*xml")
public class CashLoadsUserApplication {
	public static void main(String[] args) {
		SpringApplication.run(CashLoadsUserApplication.class, args);
	}
}
