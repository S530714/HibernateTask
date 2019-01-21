import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;

import com.mtc.app.sampledatabase.Products;
import com.mtc.app.util.HibernateUtil;

public class TestAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
Session session = sessionFactory.openSession();
Products product = new Products(productCode, productName, productLine, productScale, productVendor, productDescription, quantityInStock, buyPrice, mSRP)
	Transaction transaction = session.getTransaction();
	transaction.begin();
	session.save(product);
	transaction.commit();
	session.close();
	sessionFactory.close();
	}

}
