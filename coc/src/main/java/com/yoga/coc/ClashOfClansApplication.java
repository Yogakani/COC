package com.yoga.coc;

import com.yoga.coc.coc.ClashService;
import com.yoga.coc.service.CocService;
import com.yoga.coc.service.CocServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClashOfClansApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClashOfClansApplication.class, args);
	}

	@Bean
	public CocService cocService() {
		return new CocServiceImpl();
	}

	@Bean
	public ClashService clashService() {
		return new ClashService();
	}

}
