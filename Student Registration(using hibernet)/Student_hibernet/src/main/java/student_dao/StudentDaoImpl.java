package student_dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Student_Session_factory.Student_Session_factory;
import student.Student;



public  class StudentDaoImpl  {
	private SessionFactory factory = Student_Session_factory.getFactory();
	
	//method to save data a student data
	public void saveStudent(Student student) {
		Transaction transaction = null;
		try(Session session = factory.openSession()) {
			transaction = session.beginTransaction();
			session.save(student);
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null)
				transaction.rollback();
		}
	}
	
	/******************************************************/
	
	
	//method to get the detail by id a student data
	public Student  getStudentById(long id) {
		Transaction transaction = null;
		Student student = null;
		try(Session session = factory.openSession()) {
			transaction = session.beginTransaction();
			student= session.get(Student .class, id);
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null)
				transaction.rollback();
		}
		return student;
	}
	
	/******************************************************/
	
	
	//method to get all the detail in list a student data
	@SuppressWarnings("unchecked")
	public List<Student> getAllStudent() {
		Transaction transaction = null;
		List<Student> students = null;
		try(Session session = factory.openSession()) {
			transaction = session.beginTransaction();
			students = session.createQuery("from Student").list();
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null)
				transaction.rollback();
		}
		return students;
	}
	
	/******************************************************/
	
	//method to update
	public void updateStudent(Student student) {
		Transaction transaction = null;
		try(Session session = factory.openSession()) {
			transaction = session.beginTransaction();
			session.saveOrUpdate(student);
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null)
				transaction.rollback();
		}
	}
	
	/******************************************************/
	 
	//method to delete a data a student data
	public void deleteStudentById(long id) {
		Transaction transaction = null;
		try(Session session = factory.openSession()) {
			transaction = session.beginTransaction();
			Student student = session.get(Student.class, id);
			session.delete(student);
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null)
				transaction.rollback();
		}
	}
}
