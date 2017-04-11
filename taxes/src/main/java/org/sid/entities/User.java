package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="t_users")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private Long id_user;
	private String username;
	private String password;
	private int enabled;
	
	@OneToMany(mappedBy="user")
	private Collection<Privilege> privileges;

	public User() {
		super();
	}

	public User(String username, String password, int enabled) {
		super();
		this.username = username;
		this.password = password;
		this.enabled = enabled;
	}

	public Long getId_user() {
		return id_user;
	}

	public void setId_user(Long id_user) {
		this.id_user = id_user;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public Collection<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(Collection<Privilege> privileges) {
		this.privileges = privileges;
	}
	
	
	
}
