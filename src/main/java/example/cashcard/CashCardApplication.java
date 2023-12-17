package example.cashcard;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class CashCardApplication {

	public static void main(String[] args) {

		SpringApplication.run(CashCardApplication.class, args);
		System.out.println("Working fine");
	}

}
