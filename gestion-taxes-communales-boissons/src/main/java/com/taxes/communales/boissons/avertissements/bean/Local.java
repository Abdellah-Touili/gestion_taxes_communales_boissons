package com.taxes.communales.boissons.avertissements.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
public class Local implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	private Redevable redevable;

	// private Categorie categorie;
	// private RueLocal rueLocal;

	private String nom;

	private int derniereAnneePayee;
	private int dernierTrimestrePaye;

	// private int ville_id;
	// private int pays_id;

	@OneToMany(mappedBy = "local")
	private List<AvertissementRedevable> avertissementRedevables;

	public Local() {
	}

	public Local(Long id, Redevable redevable, String nom, int derniereAnneePayee, int dernierTrimestrePaye,
			List<AvertissementRedevable> avertissementRedevables) {
		super();
		this.id = id;
		this.redevable = redevable;
		this.nom = nom;
		this.derniereAnneePayee = derniereAnneePayee;
		this.dernierTrimestrePaye = dernierTrimestrePaye;
		this.avertissementRedevables = avertissementRedevables;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getDerniereAnneePayee() {
		return derniereAnneePayee;
	}

	public void setDerniereAnneePayee(int derniereAnneePayee) {
		this.derniereAnneePayee = derniereAnneePayee;
	}

	public int getDernierTrimestrePaye() {
		return dernierTrimestrePaye;
	}

	public void setDernierTrimestrePaye(int dernierTrimestrePaye) {
		this.dernierTrimestrePaye = dernierTrimestrePaye;
	}

	public Redevable getRedevable() {
		return redevable;
	}

	public void setRedevable(Redevable redevable) {
		this.redevable = redevable;
	}

	@JsonIgnore
	public List<AvertissementRedevable> getAvertissementRedevables() {
		return avertissementRedevables;
	}

	@JsonSetter
	public void setAvertissementRedevables(List<AvertissementRedevable> avertissementRedevables) {
		this.avertissementRedevables = avertissementRedevables;
	}

	@Override
	public String toString() {
		return "Local [id=" + id + ", redevable=" + redevable + ", nom=" + nom + ", derniereAnneePayee="
				+ derniereAnneePayee + ", dernierTrimestrePaye=" + dernierTrimestrePaye + ", avertissementRedevables="
				+ avertissementRedevables + "]";
	}

}
