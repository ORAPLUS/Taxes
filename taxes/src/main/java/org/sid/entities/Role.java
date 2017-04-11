package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="t_roles")
public class Role implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private Long id_role;
	private String nom_role;
	@OneToMany(mappedBy="role")
	private Collection<Privilege> privileges;
	
	public Role() {
		super();
	}
	public Role(String nom_role) {
		super();
		this.nom_role = nom_role;
	}
	public Long getId_role() {
		return id_role;
	}
	public void setId_role(Long id_role) {
		this.id_role = id_role;
	}
	public String getNom_role() {
		return nom_role;
	}
	public void setNom_role(String nom_role) {
		this.nom_role = nom_role;
	}
	public Collection<Privilege> getPrivileges() {
		return privileges;
	}
	public void setPrivileges(Collection<Privilege> privileges) {
		this.privileges = privileges;
	}
	
	
	
	
}
