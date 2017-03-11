package productinv;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Application {

	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(1099);
			ServiceImplement service = new ServiceImplement();
			System.out.println(service.toString());
			Naming.rebind("rmi://locahost/1099/product", service);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
