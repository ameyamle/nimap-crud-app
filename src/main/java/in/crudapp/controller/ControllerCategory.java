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

import in.crudapp.entity.EntityCategory;
import in.crudapp.service.ServiceCategory;

@RestController
@RequestMapping("/api")
public class ControllerCategory {
	@Autowired
	private ServiceCategory categoryService;
	
		// Save operation
		@PostMapping("/categories")
		public EntityCategory saveCategory(@Validated @RequestBody EntityCategory category) {
			return categoryService.saveCategory(category);
		}

		// Read operation
		@GetMapping("/categories")
		public List<EntityCategory> getAllCategory() {
			return categoryService.getAllCategory();
		}

		// Update operation
		@PutMapping("/categories/{categoryId}")
		public EntityCategory updateProduct(@RequestBody EntityCategory category, @PathVariable("categoryId") Integer categoryId) {
			return categoryService.updateCategory(category, categoryId);
		}

		// Delete operation
		@DeleteMapping("/categories/{categoryId}")
		public String delectProductById(@PathVariable("categoryId") Integer categoryId) {
			categoryService.deleteCategoryById(categoryId);
			return "Deleted Successfully";
		}
		
		// Update operation
		@GetMapping("/categories/{categoryId}")
			public Optional<EntityCategory> findById(@PathVariable("categoryId") Integer categoryId) {
				return categoryService.findById(categoryId);
			}

}
