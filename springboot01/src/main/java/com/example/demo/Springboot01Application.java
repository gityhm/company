package com.example.demo;
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
		//这是我的修改信息03
		//本地Git2注入主+git注入主脑
		
		
		SpringApplication.run(Springboot01Application.class, args);
	}

}
