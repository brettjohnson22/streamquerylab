package com.dcc.stream_test.models;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the shoppingcart database table.
 * 
 */
@Embeddable
public class ShoppingcartPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int userId;

	@Column(insertable=false, updatable=false)
	private int productId;

	public ShoppingcartPK() {
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
		if (!(other instanceof ShoppingcartPK)) {
			return false;
		}
		ShoppingcartPK castOther = (ShoppingcartPK)other;
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