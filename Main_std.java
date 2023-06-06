package com.employees;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class Main_std
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("magician");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Std s1=new Std();
		s1.setId(1);
		s1.setName("Manoj");
		s1.setCourse("MySQL");
		Std s2=new Std();
		s2.setId(2);
		s2.setName("Deepak");
		s2.setCourse("SQL");
		Std s3=new Std();
		s3.setId(3);
		s3.setName("Mona");
		s3.setCourse("Core JAVA");
		Std s4=new Std();
		s4.setId(4);
		s4.setName("Priya");
		s4.setCourse("Web Tech");
		Std s5=new Std();
		s5.setId(5);
		s5.setName("Nithin");
		s5.setCourse("Web Tech");
		Std s6=new Std();
		s6.setId(6);
		s6.setName("Rupa");
		s6.setCourse("Selenium");
		Std s7=new Std();
		s7.setId(7);
		s7.setName("Arjun");
		s7.setCourse("Adv JAVA");
		Std s8=new Std();
		s8.setId(8);
		s8.setName("Kavya");
		s8.setCourse("Manual Testing");
		Std s9=new Std();
		s9.setId(9);
		s9.setName("Shilpa");
		s9.setCourse("Adv JAVA");
		Std s10=new Std();
		s10.setId(10);
		s10.setName("Rohith");
		s10.setCourse("SQL");
		et.begin();
			em.persist(s1);
			em.persist(s2);
			em.persist(s3);
			em.persist(s4);
			em.persist(s5);
			em.persist(s6);
			em.persist(s7);
			em.persist(s8);
			em.persist(s9);
			em.persist(s10);
		et.commit();
	}
}
