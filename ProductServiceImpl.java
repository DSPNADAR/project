package com.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.dao.ProductDao;
import com.shopping.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDao ProductDao;	
	
	public ProductServiceImpl(){
		
	}
	
	public void addProduct(Product product) {
		ProductDao.addProduct(product);

	}

	public void updateProduct(Product product) {
		ProductDao.updateProduct(product);
		
	}
	
	public List<Product> listProduct() {
		return ProductDao.listProduct();
	}

	public Product getbyid(int id) {
		return ProductDao.getbyid(id);
	}

	public void deleteProduct(int id) {
		ProductDao.deleteProduct(id);
	}

	

}