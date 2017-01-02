package mainclass;

import java.util.List;

public interface ProductInterface {
	
	public void AddProd (Product p);
	public List<Product> ProductList();
	public List<Product> ProductByName(String name);
	public Product getProd(String prodct_id);
	public void updateProd(Product p);
	public void deleteProd(String prodct_id);

}
