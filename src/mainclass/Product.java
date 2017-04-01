package mainclass;

import java.io.Serializable;

public class Product implements Serializable{
	private String prod_id; //reference
	private String prod_name; //designation
	private String prod_desc;
	private double prod_price; //prix
	private int prod_amt; //quantite
	
	public Product(String prod_id, String prod_name, String prod_desc, double prod_price, int prod_amt) {
		super();
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.prod_desc = prod_desc;
		this.prod_price = prod_price;
		this.prod_amt = prod_amt;
	}
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getProd_id() {
		return prod_id;
	}
	
	
	public void setProd_id(String prod_id) {
		this.prod_id = prod_id;
	}
	
	public String getProd_name() {
		return prod_name;
	}
	
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	
	
	public String getProd_desc() {
		return prod_desc;
	}
	
	
	public void setProd_desc(String prod_desc) {
		this.prod_desc = prod_desc;
	}
	
	
	public double getProd_price() {
		return prod_price;
	}
	
	
	public void setProd_price(double prod_price) {
		this.prod_price = prod_price;
	}
	
	
	public int getProd_amt() {
		return prod_amt;
	}
	
	
	public void setProd_amt(int prod_amt) {
		this.prod_amt = prod_amt;
	}

}
