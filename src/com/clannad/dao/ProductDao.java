package com.clannad.dao;

import com.clannad.domain.Product;

/**
 * 商品管理的dao类
 * 
 * @author F_ck
 *
 */
public class ProductDao {

	/**
	 * DAO中保存商品的方法
	 * @param product
	 */
	public void save(Product product) {
		System.out.println("DAO中的save方法执行了...");
	}

}
