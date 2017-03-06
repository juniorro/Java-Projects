package mainclass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductImpl implements ProductInterface {

	@Override
	public void AddProd(Product p) {
		Connection connect = DbConnection.getConnection();
		try {
			PreparedStatement statement = connect.prepareStatement
			("INSERT INTO product(product_id, product_name, product_desc, product_amount, product_price) values (?, ?, ?, ?, ?)");
			
			statement.setString(1, p.getProd_id());
			statement.setString(2, p.getProd_name());
			statement.setString(3, p.getProd_desc());
			statement.setInt(4, p.getProd_amt());
			statement.setDouble(5, p.getProd_price());
			statement.executeUpdate();
			statement.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Product> ProductList() {
		
		List<Product> prods = new ArrayList<Product>();
		Connection connect = DbConnection.getConnection();
		try {
			PreparedStatement statement = connect.prepareStatement
			("SELECT * FROM product");
			ResultSet result = statement.executeQuery();
			
			while (result.next()){
				Product p = new Product();
				p.setProd_id(result.getString("product_id"));
				p.setProd_name(result.getString("product_name"));
				p.setProd_desc(result.getString("product_desc"));
				p.setProd_amt(result.getInt("product_amount"));
				p.setProd_price(result.getDouble("product_price"));
				prods.add(p);
			}
			statement.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prods;
	}

	@Override
	public List<Product> ProductByName(String name) {
		List<Product> prods = new ArrayList<Product>();
		Connection connect = DbConnection.getConnection();
		try {
			PreparedStatement statement = connect.prepareStatement
			("SELECT * FROM product WHERE product_name LIKE ?");
			statement.setString(1, "%"+name+"%");
			ResultSet result = statement.executeQuery();
			
			while (result.next()){
				Product p = new Product();
				p.setProd_id(result.getString("product_id"));
				p.setProd_name(result.getString("product_name"));
				p.setProd_desc(result.getString("product_desc"));
				p.setProd_amt(result.getInt("product_amount"));
				p.setProd_price(result.getDouble("product_price"));
				prods.add(p);
			}
			statement.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prods;
	}

	@Override
	public Product getProd(String prodct_id) {
		Product p = null;
		Connection connect = DbConnection.getConnection();
		try {
			PreparedStatement statement = connect.prepareStatement
			("SELECT * FROM product WHERE product_id = ?");
			statement.setString(1, prodct_id);
			ResultSet result = statement.executeQuery();
			if(result.next()){
				p = new Product();
				p.setProd_id(result.getString("product_id"));
				p.setProd_name(result.getString("product_name"));
				p.setProd_desc(result.getString("product_desc"));
				p.setProd_amt(result.getInt("product_amount"));
				p.setProd_price(result.getDouble("product_price"));
			}
			statement.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (p==null) throw new RuntimeException("Product "+prodct_id+" unavailable.");
		return p;
	}

	@Override
	public void updateProd(Product p) {
		Connection connect = DbConnection.getConnection();
		try {
			PreparedStatement statement = connect.prepareStatement
			("UPDATE product SET product_name = ?, product_desc = ?, product_amount = ?, product_price = ? WHERE product_id = ?");
			
			statement.setString(1, p.getProd_name());
			statement.setString(2, p.getProd_desc());
			statement.setInt(3, p.getProd_amt());
			statement.setDouble(4, p.getProd_price());
			statement.setString(5, p.getProd_id());
			statement.executeUpdate();
			statement.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteProd(String prodct_id) {
		Connection connect = DbConnection.getConnection();
		try {
			PreparedStatement statement = connect.prepareStatement
			("DELETE FROM product WHERE product_id = ?");
			
			statement.setString(1, prodct_id);
			statement.executeUpdate();
			statement.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
