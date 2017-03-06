package webinterface;

import java.util.ArrayList;
import java.util.List;
import mainclass.Product;

public class ProductModel {
	private String keyword;
	private Product produc = new Product();
	private String errorMessage;
	private String actiontype = "adding";
	private List<Product> products = new ArrayList<Product>();
	
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Product getProduc() {
		return produc;
	}
	public void setProduc(Product produc) {
		this.produc = produc;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getActiontype() {
		return actiontype;
	}
	public void setActiontype(String actiontype) {
		this.actiontype = actiontype;
	}
	
	
	

}
