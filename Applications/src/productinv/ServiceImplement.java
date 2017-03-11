package productinv;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class ServiceImplement extends UnicastRemoteObject implements ProductInterface {

	private Implement implement = new Implement();
	
	public ServiceImplement() throws RemoteException {
		super();
	}

	@Override
	public List<Product> getProductByName(String key) throws RemoteException {
		
		return implement.getProduct(key) ;
	}

	@Override
	public List<Product> getProductByName() throws RemoteException {
		
		return implement.productList();
	}

	@Override
	public Product ProductByID(long Idp) throws RemoteException {
		
		return implement.getProduct(Idp);
	}

	@Override
	public double averagePrice() throws RemoteException {
		List<Product> prod = null;
		implement.productList();
		double total = 0;
		for(Product p:prod){
			total = total + p.getPrice();
		}
		return total / prod.size();
	}

}
