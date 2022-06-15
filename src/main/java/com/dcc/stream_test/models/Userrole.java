package com.dcc.stream_test.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the userroles database table.
 * 
 */
@Entity
@Table(name="userroles")
@NamedQuery(name="Userrole.findAll", query="SELECT u FROM Userrole u")
public class Userrole implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UserrolePK id;

	public Userrole() {
	}

	public UserrolePK getId() {
		return this.id;
	}

	public void setId(UserrolePK id) {
		this.id = id;
	}

}