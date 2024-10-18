package com.clienteEnderecoAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ClienteEnderecoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClienteEnderecoApiApplication.class, args);
	}

}
