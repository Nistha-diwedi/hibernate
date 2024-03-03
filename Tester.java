import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Tester {

	public static void main(String[] args) {

		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory=configuration.buildSessionFactory();
		Session  session=factory.openSession();  // model class object 
		Transaction transaction=session.beginTransaction();          // Db RUD 
		Employee employee=new Employee();
		employee.setName("John");
		session.save(employee);
		transaction.commit();
		session.close();
		System.out.println("Data Inserted Successfully");
		
	}

}
