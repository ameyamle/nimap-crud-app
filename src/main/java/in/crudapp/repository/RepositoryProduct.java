package in.crudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.crudapp.entity.EntityProduct;

@Repository
public interface RepositoryProduct extends JpaRepository<EntityProduct, Integer>{

}