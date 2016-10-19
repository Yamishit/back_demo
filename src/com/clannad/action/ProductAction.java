package com.clannad.action;

import com.clannad.domain.Product;
import com.clannad.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 商品管理的action类 action中注入service类
 * 
 * @author F_ck
 * 
 */
public class ProductAction extends ActionSupport implements
		ModelDriven<Product> {
	// 模型驱动需要使用的类
	private Product product = new Product();

	public Product getModel() {
		return product;
	}

	// 原本需要webapplicationContextUtils去获取
	//Struts和Spring整合过程中按名称自动注入的业务层类
	private ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	/**
	 * 保存商品的执行方法:save
	 */
	public String save(){
		System.out.println("action中的save方法执行了...");
		productService.save(product);
		return NONE;
	}

}
