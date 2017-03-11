package productinv;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ProductInterface extends Remote {
	
	public List<Product> getProductByName(String key) throws RemoteException;
	
	public List<Product> getProductByName() throws RemoteException;
	
	public Product ProductByID(long Idp) throws RemoteException;
	
	public double averagePrice() throws RemoteException;

}
