import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mtc.app.sampledatabase.OrderDetails;
import com.mtc.app.sampledatabase.ProductLines;
import com.mtc.app.sampledatabase.Products;
import com.mtc.app.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session  session = sessionFactory.openSession();
		ProductLines prod = session.get(ProductLines.class, "Ships");
		System.out.println(prod);
		
		System.out.println("product details \n");
		Set<Products> products = prod.getProducts();
		products.forEach(System.out::println);
		
		System.out.println("orderDetails \n");
		Products product = session.get(Products.class, "S10_1678");
		System.out.println(product);
		OrderDetails orderdetails = product.getOrderdetails();
		System.out.println(orderdetails);
		session.close();
		sessionFactory.close();
	}

}
