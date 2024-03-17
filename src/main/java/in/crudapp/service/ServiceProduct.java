package in.crudapp.service;

import java.util.List;
import java.util.Optional;

import in.crudapp.entity.EntityProduct;

public interface ServiceProduct {
	
	    //save product
		EntityProduct saveProduct(EntityProduct product);
		
		//Get All category
		List<EntityProduct> getAllProduct();
		
		//Update By Id
		EntityProduct updateProduct(EntityProduct category, Integer categoryId);
		
		//Delete category By Id
		void deleteProductById(Integer categoryId);
		
		//get by Id
		Optional<EntityProduct> findById(Integer categoryId);

}
