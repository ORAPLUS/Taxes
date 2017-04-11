package org.sid.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_privileges")
public class Privilege implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private Long id;
	@ManyToOne
	@JoinColumn(name="id_user")
	private User user;
	@ManyToOne
	@JoinColumn(name="id_role")
	private Role role;
	public Privilege() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	
	
}
