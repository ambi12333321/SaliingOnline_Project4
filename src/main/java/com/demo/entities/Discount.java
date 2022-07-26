package com.demo.entities;
// Generated Jan 20, 2022, 8:39:05 PM by Hibernate Tools 5.1.10.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Discount generated by hbm2java
 */
@Entity
@Table(name = "discount", catalog = "shop")
public class Discount implements java.io.Serializable {

	private Integer id;
	private String name;
	private int discoutPercent;
	private Date created;
	private boolean status;
	private Set<OrderDetail> orderDetails = new HashSet<OrderDetail>(0);
	private Set<Product> products = new HashSet<Product>(0);

	public Discount() {
	}

	public Discount(String name, int discoutPercent, Date created, boolean status) {
		this.name = name;
		this.discoutPercent = discoutPercent;
		this.created = created;
		this.status = status;
	}

	public Discount(String name, int discoutPercent, Date created, boolean status, Set<OrderDetail> orderDetails,
			Set<Product> products) {
		this.name = name;
		this.discoutPercent = discoutPercent;
		this.created = created;
		this.status = status;
		this.orderDetails = orderDetails;
		this.products = products;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, length = 250)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "discout_percent", nullable = false)
	public int getDiscoutPercent() {
		return this.discoutPercent;
	}

	public void setDiscoutPercent(int discoutPercent) {
		this.discoutPercent = discoutPercent;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "created", nullable = false, length = 10)
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Column(name = "status", nullable = false)
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "discount")
	public Set<OrderDetail> getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(Set<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "discount")
	public Set<Product> getProducts() {
		return this.products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

}
