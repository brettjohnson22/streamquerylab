package com.dcc.stream_test.models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the products database table.
 * 
 */
@Entity
@Table(name="products")
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String description;

	private String name;

	private BigDecimal price;

	//bi-directional many-to-one association to ShoppingcartItem
	@OneToMany(mappedBy="product")
	private List<ShoppingcartItem> shoppingcartItems;

	public Product() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public List<ShoppingcartItem> getShoppingcartItems() {
		return this.shoppingcartItems;
	}

	public void setShoppingcartItems(List<ShoppingcartItem> shoppingcartItems) {
		this.shoppingcartItems = shoppingcartItems;
	}

	public ShoppingcartItem addShoppingcartItem(ShoppingcartItem shoppingcartItem) {
		getShoppingcartItems().add(shoppingcartItem);
		shoppingcartItem.setProduct(this);

		return shoppingcartItem;
	}

	public ShoppingcartItem removeShoppingcartItem(ShoppingcartItem shoppingcartItem) {
		getShoppingcartItems().remove(shoppingcartItem);
		shoppingcartItem.setProduct(null);

		return shoppingcartItem;
	}

}