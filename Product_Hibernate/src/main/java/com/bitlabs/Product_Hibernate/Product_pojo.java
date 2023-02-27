package com.bitlabs.Product_Hibernate;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;



@Entity
@Table(name="Product_Info")
public class Product_pojo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@Column(name="Quantity")
	private int qty;
	@Transient
	private int stock;
	@Column(name="Ordered_Date")
	@Temporal(TemporalType.DATE)
	private Date odate;
	@Lob
	private byte[] image;
	
	
	
	
	public Product_pojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Product_pojo(String name, int qty, int stock, Date odate, byte[] image) {
		super();
		this.name = name;
		this.qty = qty;
		this.stock = stock;
		this.odate = odate;
		this.image = image;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Date getOdate() {
		return odate;
	}
	public void setOdate(Date odate) {
		this.odate = odate;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
	

}
