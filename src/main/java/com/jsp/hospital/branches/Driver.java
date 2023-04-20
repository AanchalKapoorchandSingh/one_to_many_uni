package com.jsp.hospital.branches;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("aanchal");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Hospital h2=new Hospital();
		h2.setName("Apollo");
		h2.setGst_no("asdfgh12345");
		
		Branch b1=new Branch();
		b1.setName("Apollo-1");
		b1.setLocation("vashi");
		
		Branch b2=new Branch();
		b2.setName("Apollo-2");
		b2.setLocation("Thane");
		
		Branch b3=new Branch();
		b3.setName("Apollo-3");
		b3.setLocation("panvel");
		
		List<Branch> branches=new ArrayList<Branch>();
		branches.add(b1);
		branches.add(b2);
		branches.add(b3);
		
		//uni-direction
		h2.setBranches(branches);
		
		et.begin();
		em.persist(b1);
		em.persist(b2);
		em.persist(b3);
		em.persist(h2);
		et.commit();
	}
}
