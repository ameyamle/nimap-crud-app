package in.crudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.crudapp.entity.EntityCategory;

@Repository
public interface RepositoryCategory extends JpaRepository<EntityCategory, Integer>{

}