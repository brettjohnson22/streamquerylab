package com.dcc.stream_test.models;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String email;

	private String password;

	@Column(name="registration_date")
	private Timestamp registrationDate;

	//bi-directional many-to-one association to ShoppingcartItem
	@OneToMany(mappedBy="user")
	private List<ShoppingcartItem> shoppingcartItems;

	//bi-directional many-to-many association to Role
	@ManyToMany
	@JoinTable(
		name="user_roles"
		, joinColumns={
			@JoinColumn(name="user_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="role_id")
			}
		)
	private List<Role> roles;

	public User() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getRegistrationDate() {
		return this.registrationDate;
	}

	public void setRegistrationDate(Timestamp registrationDate) {
		this.registrationDate = registrationDate;
	}

	public List<ShoppingcartItem> getShoppingcartItems() {
		return this.shoppingcartItems;
	}

	public void setShoppingcartItems(List<ShoppingcartItem> shoppingcartItems) {
		this.shoppingcartItems = shoppingcartItems;
	}

	public ShoppingcartItem addShoppingcartItem(ShoppingcartItem shoppingcartItem) {
		getShoppingcartItems().add(shoppingcartItem);
		shoppingcartItem.setUser(this);

		return shoppingcartItem;
	}

	public ShoppingcartItem removeShoppingcartItem(ShoppingcartItem shoppingcartItem) {
		getShoppingcartItems().remove(shoppingcartItem);
		shoppingcartItem.setUser(null);

		return shoppingcartItem;
	}

	public List<Role> getRoles() {
		return this.roles;
	}
	
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Role addRole(Role role) {
		getRoles().add(role);
		role.addUser(this);
		return role;
	}

	public Role removeRole(Role role) {
		getRoles().remove(role);
		role.removeUser(this);
		return role;
	}

}