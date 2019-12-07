package com.taxes.communales.boissons.avertissements.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.sun.istack.NotNull;

@Entity
public class TypeAvertissement  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String libelle;

	@OneToMany(mappedBy = "typeAvertissement")
	private List<AvertissementRedevable> avertissementRedevables;

	public TypeAvertissement() {
	}

	public TypeAvertissement(Long id, String libelle) {
		this.id = id;
		this.libelle = libelle;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * @return the avertissementRedevable
	 */
	@JsonIgnore
	public List<AvertissementRedevable> getAvertissementRedevables() {
		return avertissementRedevables;
	}

	/**
	 * @param avertissementRedevable the avertissementRedevable to set
	 */
	@JsonSetter
	public void setAvertissementRedevable(List<AvertissementRedevable> avertissementRedevables) {
		this.avertissementRedevables = avertissementRedevables;
	}

	@Override
	public String toString() {
		return "TypeAvertissement [id=" + id + ", libelle=" + libelle + ", avertissementRedevable="
				+ avertissementRedevables + "]";
	}

	

}
