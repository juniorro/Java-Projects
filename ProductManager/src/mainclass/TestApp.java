package mainclass;

import java.util.List;

public class TestApp {

	public static void main(String[] args) {
		ProductInterface prodinter = new ProductImpl();
		prodinter.AddProd(new Product("GSE01", "Google Search", "Google Search Engine", 100, 20));
		prodinter.AddProd(new Product("GAY4", "Google Alerts", "Google Alerts For You", 220, 10));
		prodinter.AddProd(new Product("GBY4", "Google Books", "Google Books Your Read", 600, 25));
		prodinter.AddProd(new Product("GCSE3", "Google Custom Search", "Google Custom Search Engine", 100, 20));
		prodinter.AddProd(new Product("GFM54", "Google Finance", "Google Finance Monetary", 49, 30));
		prodinter.AddProd(new Product("GNW01", "Google News", "Google News Worldwide", 543, 10));
		prodinter.AddProd(new Product("GSR4", "Google Scholar", "Google Scholar Research", 233, 18));
		prodinter.AddProd(new Product("GAP67", "Google Art Project", "Google Art Beaux Arts", 123, 10));
		prodinter.AddProd(new Product("GBW56", "Blogger ", "Google Blogger Web", 42, 15));
		prodinter.AddProd(new Product("GDN31", "Google Domains", "Google Domains Network", 23, 40));
		System.out.println("-------------------");
		
		List<Product> prods = prodinter.ProductList();
		
		for (Product p:prods){
			
			System.out.println(p.getProd_name());
		}
		
		System.out.println("-------------------");
		
		List<Product> prods2 = prodinter.ProductByName("Too");
		
		for (Product p:prods2){
			
			System.out.println(p.getProd_name());
		}
		
		System.out.println("-------------------");
		
		try {
			Product p = prodinter.getProd("CG13");		
			System.out.println(p.getProd_name());
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("-------------------");
		
		try {
			Product p = prodinter.getProd("WPD3");
			p.setProd_name("Colegate Yellow");
			prodinter.updateProd(p);
			Product p2 = prodinter.getProd("ALL");
			System.out.println(p2.getProd_name());
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("-------------------");
		
		//prodinter.deleteProd("WPD3");

	}

}
