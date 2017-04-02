package com.shopping.dao;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shopping.model.Customer;
@Repository
public abstract class CustomerDaoImpl implements CustomerDao {
	@Autowired
	SessionFactory sf;

	public boolean addCustomer1(Customer c) {
		Session s=sf.openSession();
		s.save(c);
		return true;
	}

	public boolean delCustomer(int id) {
		Session s=sf.openSession();
		Customer c=s.get(Customer.class,id);
		s.delete(c);
		return true;
	}

	public boolean updCustomer1(Customer c) {
		Session s=sf.openSession();
		s.update(c);
		return true;
	}

	public Customer getCustomerByName1(String name) {
		Session s=sf.openSession();
		Query q = s.createQuery("from Customer where cname =" +name);
		return(Customer) q.uniqueResult();
	}

	public List<Customer> getAllCustomer() {

		Session s = sf.openSession();
		List<Customer> l = s.createQuery("from Customer").list();
		return l;
	}

	public boolean addCustomer(Customer c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updCustomer(Customer c) {
		// TODO Auto-generated method stub
		return false;
	}

	public Customer getCustomerByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
	