package org.hibernate.Test;

import org.hibernate.Session;
import org.hibernate.entity.Address;
import org.hibernate.entity.HiberateUtil;
import org.hibernate.entity.User;

public class Test {
	public static void main(String[] args) {
		Session session = HiberateUtil.getSession();
		session.beginTransaction();
		try {
			User user=new User();
			user.setNama("Jack");
			user.setPassword("111");
			Address address=new Address();
			address.setAddressinfo("America");
			user.setAddress(address);
			
			session.save(user);
			session.save(address);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		
		

	}
}
