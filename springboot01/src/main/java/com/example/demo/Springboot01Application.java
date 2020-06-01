package com.example.demo;
//abc
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class })
public class Springboot01Application {

	public static void main(String[] args) {
		//这是我的修改信息
		//这是我的修改信息02
		SpringApplication.run(Springboot01Application.class, args);
	}

}
