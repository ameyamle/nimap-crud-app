package in.crudapp.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class EntityCategory {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer categoryId;
	private String categoryName;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "categoryId", referencedColumnName = "categoryId")
    List <EntityCategory> products = new ArrayList <> ();
	
	public List<EntityCategory> getProducts() {
		return products;
	}

	public void setProducts(List<EntityCategory> products) {
		this.products = products;
	}

	public Integer getCategoryId() {
		return categoryId;
	}
	
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public String toString() {
		return "CategoryEntity [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}

	public EntityCategory() {
		super();
	}

	public EntityCategory(String categoryName, List<EntityCategory> products) {
		super();
		this.categoryName = categoryName;
		this.products = products;
	}
}
