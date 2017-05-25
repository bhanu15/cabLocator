package cablocator.api.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * The spring boot application class
 * 
 */
@SpringBootApplication
@ComponentScan(basePackages = { "cablocator.api.*" })
public class CabLocatorApplication {

	/**
	 * first method of the application
	 * 
	 * @param args
	 *            application arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(CabLocatorApplication.class, args);
	}
}
