package in.crudapp.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.crudapp.entity.EntityCategory;
import in.crudapp.repository.RepositoryCategory;

@Service
public class ServiceCategoryImplement implements ServiceCategory{
	
	@Autowired
	private RepositoryCategory repositoryCategory;

	@Override
	public EntityCategory saveCategory(EntityCategory category) {
		return repositoryCategory.save(category);
	}

	@Override
	public List<EntityCategory> getAllCategory() {
		return (List<EntityCategory>) repositoryCategory.findAll();
	}

	@Override
	public EntityCategory updateCategory(EntityCategory category, Integer categoryId) {
		EntityCategory cat = repositoryCategory.findById(categoryId).get();

		if(Objects.nonNull(category.getCategoryName()) && !"".equalsIgnoreCase(category.getCategoryName()))
		{
			cat.setCategoryName(category.getCategoryName());
		}

		return repositoryCategory.save(cat);
	}

	@Override
	public void deleteCategoryById(Integer categoryId) {
		repositoryCategory.deleteById(categoryId);		
	}

	@Override
	public Optional<EntityCategory> findById(Integer categoryId) {
		return repositoryCategory.findById(categoryId);
	}

}
