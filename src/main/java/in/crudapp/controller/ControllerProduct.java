package in.crudapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.crudapp.entity.EntityProduct;
import in.crudapp.service.ServiceProduct;

@RestController
@RequestMapping("/api")
public class ControllerProduct {

	@Autowired
	private ServiceProduct productService;

	// Save operation
	@PostMapping("/products")
	public EntityProduct saveProduct(@Validated @RequestBody EntityProduct product) {
		return productService.saveProduct(product);
	}

	// Read operation
	@GetMapping("/products")
	public List<EntityProduct> getAllProduct() {
		return productService.getAllProduct();
	}

	// Update operation
	@PutMapping("/products/{productId}")
	public EntityProduct updateProduct(@RequestBody EntityProduct product, @PathVariable("productId") Integer productId) {
		return productService.updateProduct(product, productId);
	}

	// Delete operation
	@DeleteMapping("/products/{productId}")
	public String delectProductById(@PathVariable("productId") Integer productId) {
		productService.deleteProductById(productId);
		return "Deleted Successfully";
	}
	
	// Update operation
	@GetMapping("/products/{productId}")
		public Optional<EntityProduct> findById(@PathVariable("productId") Integer productId) {
			return productService.findById(productId);
		}

}
