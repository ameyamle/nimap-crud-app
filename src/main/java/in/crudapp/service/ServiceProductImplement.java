package in.crudapp.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.crudapp.entity.EntityProduct;
import in.crudapp.repository.RepositoryProduct;

@Service
public class ServiceProductImplement implements ServiceProduct {
	
	@Autowired
	private RepositoryProduct repositoryProduct;

	@Override
	public EntityProduct saveProduct(EntityProduct product) {
		return repositoryProduct.save(product);
	}

	@Override
	public List<EntityProduct> getAllProduct() {
		return (List<EntityProduct>) repositoryProduct.findAll();
	}

	@Override
	public EntityProduct updateProduct(EntityProduct product, Integer productId) {
		EntityProduct prod = repositoryProduct.findById(productId).get();

		if (Objects.nonNull(product.getProductName()) && !"".equalsIgnoreCase(product.getProductName())) {
			prod.setProductName(product.getProductName());
		}
		if (Objects.nonNull(product.getProductPrice()) && !"".equalsIgnoreCase(product.getProductPrice())) {
			prod.setProductPrice(product.getProductPrice());
		}
		return repositoryProduct.save(prod);
	}

	@Override
	public void deleteProductById(Integer productId) {
		repositoryProduct.deleteById(productId);
	}

	@Override
	public Optional<EntityProduct> findById(Integer productId) {
		return repositoryProduct.findById(productId);
	}
}
