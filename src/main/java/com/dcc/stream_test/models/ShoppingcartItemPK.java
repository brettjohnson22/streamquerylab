package com.dcc.stream_test.models;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the shoppingcart_item database table.
 * 
 */
@Embeddable
public class ShoppingcartItemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="user_id", insertable=false, updatable=false)
	private int userId;

	@Column(name="product_id", insertable=false, updatable=false)
	private int productId;

	public ShoppingcartItemPK() {
	}
	public int getUserId() {
		return this.userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getProductId() {
		return this.productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ShoppingcartItemPK)) {
			return false;
		}
		ShoppingcartItemPK castOther = (ShoppingcartItemPK)other;
		return 
			(this.userId == castOther.userId)
			&& (this.productId == castOther.productId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userId;
		hash = hash * prime + this.productId;
		
		return hash;
	}
}