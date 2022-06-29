package cn.lys.kmp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class KmpApplication {

	public static void main(String[] args) {
		SpringApplication.run(KmpApplication.class, args);
	}
}
