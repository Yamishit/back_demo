package com.clannad.service;

import com.clannad.dao.ProductDao;
import com.clannad.domain.Product;

/**
 * 商品管理的业务层的类 service中注入dao类
 * 
 * @author F_ck
 * 
 */
public class ProductService {
	// spring中只要有相应的set的方法就可以注入
	// 业务层注入DAO类
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	/**
	 * 业务层保存商品的方法
	 * @param product
	 */
	public void save(Product product) {
		System.out.println("Service中的save方法执行了...");
		productDao.save(product);
	}

}
