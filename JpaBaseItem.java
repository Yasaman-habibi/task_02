package ir.freeland.springboot.persistence.base;

//import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

//import ir.freeland.springboot.persistence.model.Gender;
import ir.freeland.springboot.persistence.model.Item;
//import ir.freeland.springboot.persistence.model.Students;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
public class JpaBaseItem {
	
	@PersistenceContext
	private EntityManager entityManager;
	

	public void sampleRun() {
		entityManager=entityManager.getEntityManagerFactory().createEntityManager();		
		Session session = entityManager.unwrap(Session.class);
		Transaction transaction = session.getTransaction();
		
		//Save*****************************************
		transaction.begin();
		Item item = new Item();
		item.setName("persianCarpet");
		item.setPrice(1200);
		item.setCategory("Carpet");
    	
    	session.persist(item);
		
    	transaction.commit();
    	
    	//Find*****************************************
    	transaction.begin();
    	List<Item> allItem = session.createQuery("from Item" , Item.class).getResultList();
    	allItem.stream().forEach( s -> System.out.println(s));    	
    	transaction.commit();

    	//Update *****************************************
    	transaction.begin();
    	allItem.get(0).setName("rug");
    	transaction.commit();
    	
    	//Delete *****************************************
    	transaction.begin();
    	session.remove(  allItem.get(1) );
    	transaction.commit();
    	
    	
	}
}
