package in.crudapp.service;

import java.util.List;
import java.util.Optional;

import in.crudapp.entity.EntityCategory;

public interface ServiceCategory {
	
	    //save category
		EntityCategory saveCategory(EntityCategory category);
		
		//Get All category
		List<EntityCategory> getAllCategory();
		
		//Update By Id
		EntityCategory updateCategory(EntityCategory category, Integer categoryId);
		
		//Delete category By Id
		void deleteCategoryById(Integer categoryId);
		
		//get by Id
		Optional<EntityCategory> findById(Integer categoryId);

}
