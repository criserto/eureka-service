package config.service.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${product.product-name}")
	private String myProduct;
	
	@GetMapping("/getProductName")
	public String myProduct() {
		return this.myProduct;
	}
}
