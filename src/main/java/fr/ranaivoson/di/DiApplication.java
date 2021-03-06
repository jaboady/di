package fr.ranaivoson.di;

import fr.ranaivoson.di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		controller.salama();
	}
}
