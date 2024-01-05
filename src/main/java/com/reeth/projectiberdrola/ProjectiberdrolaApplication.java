package com.reeth.projectiberdrola;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.reeth.projectiberdrola.model")
public class ProjectiberdrolaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectiberdrolaApplication.class, args);
	}

}
