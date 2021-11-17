package model;
// Generated 2021�~11��15�� �U��1:11:23 by Hibernate Tools 5.5.7.Final

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Coffees generated by hbm2java
 */
@Entity
@Table(name="coffees")
public class Coffees implements java.io.Serializable {
	@Id
	@Column(name="COF_NAME")
	private String cofName;
	@ManyToOne
	@JoinColumn(name="SUP_ID", referencedColumnName="SUP_ID")
	private Suppliers suppliers;
	private BigDecimal price;
	private int sales;
	private int total;

	public Coffees() {
	}

	public Coffees(String cofName, Suppliers suppliers, BigDecimal price, int sales, int total) {
		this.cofName = cofName;
		this.suppliers = suppliers;
		this.price = price;
		this.sales = sales;
		this.total = total;
	}

	public String getCofName() {
		return this.cofName;
	}

	public void setCofName(String cofName) {
		this.cofName = cofName;
	}

	public Suppliers getSuppliers() {
		return this.suppliers;
	}

	public void setSuppliers(Suppliers suppliers) {
		this.suppliers = suppliers;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getSales() {
		return this.sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public int getTotal() {
		return this.total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
