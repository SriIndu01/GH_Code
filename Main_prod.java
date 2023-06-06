package com.employees;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main_prod {

	public static void main(String[] args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("magician");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Product p1=new Product();
		p1.setId(101);
		p1.setCategory("Refrigerator");
		p1.setName("Samsung-DD");
		p1.setPrice(196990);
		Product p2=new Product();
		p2.setId(102);
		p2.setCategory("Refrigerator");
		p2.setName("Whirlpool-SD");
		p2.setPrice(224990);
		Product p3=new Product();
		p3.setId(103);
		p3.setCategory("Laptop");
		p3.setName("HP");
		p3.setPrice(88000);
		Product p4=new Product();
		p4.setId(104);
		p4.setCategory("Mobile Phones");
		p4.setName("One Plus");
		p4.setPrice(19999);
		Product p5=new Product();
		p5.setId(105);
		p5.setCategory("Smart-TV");
		p5.setName("KG");
		p5.setPrice(40990);
		Product p6=new Product();
		p6.setId(106);
		p6.setCategory("Smart-TV");
		p6.setName("Sony");
		p6.setPrice(124990);
		Product p7=new Product();
		p7.setId(107);
		p7.setCategory("Mobile Phone");
		p7.setName("Samsung Galaxy");
		p7.setPrice(109999);
		Product p8=new Product();
		p8.setId(108);
		p8.setCategory("AC");
		p8.setName("Voltas");
		p8.setPrice(35980);
		Product p9=new Product();
		p9.setId(109);
		p9.setCategory("Refrigerator");
		p9.setName("Haier-DD");
		p9.setPrice(97300);
		Product p10=new Product();
		p10.setId(110);
		p10.setCategory("Laptop");
		p10.setName("Apple");
		p10.setPrice(110490);
		et.begin();
			em.persist(p1);
			em.persist(p2);
			em.persist(p3);
			em.persist(p4);
			em.persist(p5);
			em.persist(p6);
			em.persist(p7);
			em.persist(p8);
			em.persist(p9);
			em.persist(p10);
		et.commit();

	}

}
