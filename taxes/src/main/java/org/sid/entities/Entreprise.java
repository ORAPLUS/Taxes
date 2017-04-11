package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="T_ENTREPRISE")
public class Entreprise implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	private Long code;
	@NotNull
	@Size(min=2,max=20)
	private  String nom;
	@NotNull
	@Size(min=6,max=40)
	private String email;
	@NotNull
	@Size(min=4,max=30)
	private String raisonSociale;
	@OneToMany(mappedBy="entreprise")
	private Collection<Taxe> taxes;
	
	
	public Entreprise() {
		super();
	}
	
	public Entreprise(String nom, String email, String raisonSociale) {
		super();
		this.nom = nom;
		this.email = email;
		this.raisonSociale = raisonSociale;
	}

	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRaisonSociale() {
		return raisonSociale;
	}
	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}
	@JsonIgnore
	public Collection<Taxe> getTaxes() {
		return taxes;
	}
	public void setTaxes(Collection<Taxe> taxes) {
		this.taxes = taxes;
	}
	
	
}
