package com.springorm.delete;

import java.util.List;

import javax.transaction.Transactional;

import com.springorm.Employee;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class ProductDto {

	private HibernateTemplate template;

	public void setHibernateTemplate(HibernateTemplate template) {
		this.template = template;
	}

	/* .....................save opration........................... */
	@Transactional
	public void saveProduct(Product p) {
		Integer i = (Integer) this.template.save(p);

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

}
