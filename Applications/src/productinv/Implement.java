package productinv;
import java.util.ArrayList;
import java.util.List;

public class Implement {
	private List<Product> product = new ArrayList<>();

	public Implement() {
		product.add(new Product(1L, "Dell XPS", 1000.00, "photo.png"));
		
		product.add(new Product(2L, "Dell Inspiron", 500.00, "photo1.png"));
		
		product.add(new Product(3L, "Dell ZVS", 790.00, "photo2.png"));
		
		product.add(new Product(4L, "Dell XPSV2", 600.00, "photo3.png"));
	}
	
	public List<Product> productList(){
		return product;
	}
	
	public List<Product> getProduct(String keyword){
		List<Product> prods = new ArrayList<Product>();
		for(Product p:product){
			if(p.getProName().indexOf(keyword)>0)
				prods.add(p);
		}
		return prods;
	}
	
	public Product getProduct(long idPro){
		for(Product p:product)
			if(p.getProId().equals(idPro)){
				return p;
			}
		return null;
	}
	

}
