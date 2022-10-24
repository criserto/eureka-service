package com.nttdata.bootcamp.productservice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

	//UNA FORMA DE PEDIRLO OBTENDRÍAMOS MÁS INFORMACIÓN
	@Autowired
	private HttpServletRequest request;
	
	//OTRA FORMA DE PEDIRLO, SOLO VAMOS AL MEOLLO
	@Value("${server.port}")
	private String port;
	
	@RequestMapping(value = "/port")
	public String port() {

		//return "El puerto del micro es " + port;
		return "El puerto del micro es " + request.getServerPort();

	}
}
