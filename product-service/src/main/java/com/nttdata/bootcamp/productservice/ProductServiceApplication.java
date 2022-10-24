package com.nttdata.bootcamp.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@RestController
public class ProductServiceApplication {

    //UNA FORMA DE PEDIRLO OBTENDRÍAMOS MÁS INFORMACIÓN
    @Autowired
    private HttpServletRequest request;
    //OTRA FORMA DE PEDIRLO, SOLO VAMOS AL MEOLLO
    @Value("${server.port}")
    private String port;

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

    @RequestMapping(value = "/port")
    public String port() {

        //return "El puerto del micro es " + port;
        return "El puerto del micro es " + request.getServerPort();

    }
}
