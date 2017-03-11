package productinv;
import java.io.Serializable;

public class Product implements Serializable {
	
	private Long proId;
	private String proName;
	private double price;
	private String image;
	
	
	public Long getProId() {
		return proId;
	}
	
	
	public void setProId(Long proId) {
		this.proId = proId;
	}
	
	
	public String getProName() {
		return proName;
	}
	
	
	public void setProName(String proName) {
		this.proName = proName;
	}
	
	
	public double getPrice() {
		return price;
	}
	
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public String getImage() {
		return image;
	}
	
	
	public void setImage(String image) {
		this.image = image;
	}
	
	
	public Product(Long proId, String proName, double price, String image) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.price = price;
		this.image = image;
	}
	
	
	public Product() {
		super();
	}
	
	
}
