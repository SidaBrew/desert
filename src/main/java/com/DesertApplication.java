package com;

import com.github.pagehelper.PageHelper;
import com.sidabw.config.ConfigBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

@MapperScan("com.dao")
@SpringBootApplication
@RestController
@EnableConfigurationProperties({ConfigBean.class})
public class DesertApplication extends SpringBootServletInitializer {



	public static void main(String[] args) {
		SpringApplication.run(DesertApplication.class, args);
	}

	@Bean
	public PageHelper pageHelper() {
		System.out.println("MyBatisConfiguration.pageHelper()");
		PageHelper pageHelper = new PageHelper();
		Properties p = new Properties();
		p.setProperty("offsetAsPageNum", "true");
		p.setProperty("rowBoundsWithCount", "true");
		p.setProperty("reasonable", "true");
		pageHelper.setProperties(p);
		return pageHelper;
	}

}
