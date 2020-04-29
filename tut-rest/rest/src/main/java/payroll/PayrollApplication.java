package payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class PayrollApplication {

	public static void main(String... args) {
		//SpringApplication.run(PayrollApplication.class, args);
		SpringApplication app = new SpringApplication(PayrollApplication.class);
		app.setDefaultProperties(Collections
				.singletonMap("server.port", "8083"));
		app.run(args);
	}
}
