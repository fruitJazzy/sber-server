package ru.sber.tex;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.annotation.WebServlet;

/**
 * Created by fruitjazzy on 06.07.17.
 */
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		new SpringApplicationBuilder()
				.sources(Application.class)
				.run();
	}
}
