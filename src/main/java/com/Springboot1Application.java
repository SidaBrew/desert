package com;

import com.sidabw.ConfigBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableConfigurationProperties({ConfigBean.class})
public class Springboot1Application extends SpringBootServletInitializer {



	public static void main(String[] args) {

		SpringApplication.run(Springboot1Application.class, args);
	}


}
