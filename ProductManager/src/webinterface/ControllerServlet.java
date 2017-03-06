package webinterface;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mainclass.ProductInterface;
import mainclass.ProductImpl;
import java.util.List;
import mainclass.Product;



public class ControllerServlet extends HttpServlet {
	
	private ProductInterface mainclass;
    

	@Override
	public void init() throws ServletException {
		mainclass = new ProductImpl();
	}
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
			ProductModel model = new ProductModel();
			request.setAttribute("mode", model);
			String action = request.getParameter("action");
			if(action != null){
				if(action.equals("Search")){					
					model.setKeyword(request.getParameter("keyword"));
					List<Product> products = mainclass.ProductByName(model.getKeyword());
					model.setProducts(products);
				}
				else if(action.equals("delete")){
					String key = request.getParameter("keyword");
					mainclass.deleteProd(key);
					model.setProducts(mainclass.ProductList());
				}
				
				else if(action.equals("edit")){
					String key = request.getParameter("keyword");
					Product p = mainclass.getProd(key);
					model.setProduc(p);
					model.setActiontype("edit");
					//model.setProducts(mainclass.ProductList());
				}
				
				else if(action.equals("Save")){
						try{
							model.getProduc().setProd_id(request.getParameter("prod_id"));
							model.getProduc().setProd_name(request.getParameter("prod_name"));
							model.getProduc().setProd_desc(request.getParameter("prod_desc"));
							model.getProduc().setProd_amt(Integer.parseInt(request.getParameter("prod_amt")));
							model.getProduc().setProd_price(Double.parseDouble(request.getParameter("prod_price")));
							model.setActiontype(request.getParameter("actiontyp"));
							if(model.getActiontype().equals("adding")){
								mainclass.AddProd(model.getProduc());}
							
							else if(model.getActiontype().equals("edit")){
								mainclass.updateProd(model.getProduc());}
								
							model.setProducts(mainclass.ProductList());
							}catch(Exception e){
								model.setErrorMessage(e.getMessage());
								}
					
						}				
				}
			
			request.getRequestDispatcher("ViewProducts.jsp").
			forward(request, response);
	}

}
