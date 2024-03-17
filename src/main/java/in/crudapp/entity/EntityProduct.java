package in.crudapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EntityProduct {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer productId;
	private String productName;
	private String productPrice;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public EntityProduct(String productName, String productPrice) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	@Override
	public String toString() {
		return "ProductEntity [productId=" + productId + ", productName=" + productName + ", productPrice="
				+ productPrice + "]";
	}
	public EntityProduct() {
		super();
	}
}