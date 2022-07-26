package com.demo.entities;
// Generated Jan 24, 2022, 7:57:00 AM by Hibernate Tools 5.1.10.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Orders generated by hbm2java
 */
@Entity
@Table(name = "orders", catalog = "shop")
public class Orders implements java.io.Serializable {

	private Integer orderId;
	private Shippers shippers;
	private Status status;
	private Store store;
	private User user;
	private Date created;
	private Date orderOfStart;
	private Date orderOfFinish;
	private String address;
	private String payment;
	private Set<OrderDetail> orderDetails = new HashSet<OrderDetail>(0);

	public Orders() {
	}

	public Orders(Shippers shippers, Status status, Store store, User user, Date created, Date orderOfStart,
			Date orderOfFinish, String address, String payment) {
		this.shippers = shippers;
		this.status = status;
		this.store = store;
		this.user = user;
		this.created = created;
		this.orderOfStart = orderOfStart;
		this.orderOfFinish = orderOfFinish;
		this.address = address;
		this.payment = payment;
	}

	public Orders(Shippers shippers, Status status, Store store, User user, Date created, Date orderOfStart,
			Date orderOfFinish, String address, String payment, Set<OrderDetail> orderDetails) {
		this.shippers = shippers;
		this.status = status;
		this.store = store;
		this.user = user;
		this.created = created;
		this.orderOfStart = orderOfStart;
		this.orderOfFinish = orderOfFinish;
		this.address = address;
		this.payment = payment;
		this.orderDetails = orderDetails;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "order_id", unique = true, nullable = false)
	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "shipper_id", nullable = false)
	public Shippers getShippers() {
		return this.shippers;
	}

	public void setShippers(Shippers shippers) {
		this.shippers = shippers;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "status_id", nullable = false)
	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "store_id", nullable = false)
	public Store getStore() {
		return this.store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "created", nullable = false, length = 10)
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "order_of_start", nullable = false, length = 10)
	public Date getOrderOfStart() {
		return this.orderOfStart;
	}

	public void setOrderOfStart(Date orderOfStart) {
		this.orderOfStart = orderOfStart;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "order_of_finish", nullable = false, length = 10)
	public Date getOrderOfFinish() {
		return this.orderOfFinish;
	}

	public void setOrderOfFinish(Date orderOfFinish) {
		this.orderOfFinish = orderOfFinish;
	}

	@Column(name = "address", nullable = false, length = 250)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "payment", nullable = false, length = 250)
	public String getPayment() {
		return this.payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "orders")
	public Set<OrderDetail> getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(Set<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

}
