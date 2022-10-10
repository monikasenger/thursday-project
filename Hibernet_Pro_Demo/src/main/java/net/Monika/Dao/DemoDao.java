package net.Monika.Dao;

import org.hibernate.Transaction;

import com.mysql.cj.Query;

import net.Monika.Hibernet.Demo;
import net.Monika.session.Session_Factory;

import java.util.List;

import org.hibernate.Session;



public class DemoDao {
	
	
//save method
	public void save_demo(Demo ob ) 
	{
		Transaction transaction =null;
		try(Session session = Session_Factory.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			session.save(ob);
			transaction.commit();
		}
		catch(Exception e )
		{
			if(transaction != null)
			{
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
		
	}
	
	//update method
	public void update_demo(Demo ob ) 
	{
		Transaction transaction =null;
		try(Session session = Session_Factory.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			session.update(ob);
			transaction.commit();
		}
		catch(Exception e )
		{
			if(transaction != null)
			{
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	
	
	//search method
	public Demo search_demo(long id) 
	{
		Transaction transaction =null;
		Demo demo = null;
		try(Session session = Session_Factory.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			
			// d = s.byId(Demo.class).getReference(id);
			//d= s.load(Demo.class, id);
			demo= session.get(Demo.class, id);  
			System.out.println("name: "+demo.getUser_name());
	           // System.out.println(d.getUser_email());	
					
			transaction.commit();
		}
		catch(Exception e )
		{
			if(transaction != null)
			{
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return demo;
	}
	
	//show all method
	@SuppressWarnings({ "unchecked", "unused" })
	public List<Demo> showAll_demo() 
	{
		
		Transaction transaction =null;
		List<Demo> list = null;
		try(Session session = Session_Factory.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			list = session.createQuery("from Demo").list();
			transaction.commit();
		}
		catch(Exception e )
		{
			if(transaction != null)
			{
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return list;
	}
	
	
	//delete method
	public  void delete_demo(Long id) 
	{
		
		Transaction transaction =null;
		Demo demo = null;
		try(Session session = Session_Factory.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			demo = session.get(Demo.class, id);
			if (demo != null) {
				
                session.delete(demo);
                System.out.println(" deleted.....");
            }
			transaction.commit();
		}
		catch(Exception e )
		{
			if(transaction != null)
			{
				transaction.rollback();
			}
			e.printStackTrace();
		}
	
	}
}