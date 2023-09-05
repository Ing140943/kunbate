package myexercise;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("myexercise")
public class BusinessCalculationApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(BusinessCalculationApplication.class)) {
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
		;
	}
}
