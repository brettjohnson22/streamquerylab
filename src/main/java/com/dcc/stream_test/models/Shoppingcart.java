package com.dcc.stream_test.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the shoppingcart database table.
 * 
 */
@Entity
@NamedQuery(name="Shoppingcart.findAll", query="SELECT s FROM Shoppingcart s")
public class Shoppingcart implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ShoppingcartPK id;

	private int quantity;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="ProductId", insertable=false, updatable=false)
	private Product product;

	public Shoppingcart() {
	}

	public ShoppingcartPK getId() {
		return this.id;
	}

	public void setId(ShoppingcartPK id) {
		this.id = id;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}