package com.taxes.communales.boissons.avertissements.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
public class Redevable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;
	private String nomResponsable;
	private String prenomResponsable;
	private String cne;
	private int rc;
	private int ice;
	private int identifiantFiscal;

	private String telephoneFixe;
	private String telephoneMobile;
	private String faxe;
	private String email;

	@OneToMany(mappedBy = "redevable")
	private List<AvertissementRedevable> avertissementRedevables;

	@OneToMany(mappedBy = "redevable")
	private List<Local> locals;

	public Redevable() {
	}

	public Redevable(Long id, String nomResponsable, String prenomResponsable, String cne, int rc, int ice,
			int identifiantFiscal, String telephoneFixe, String telephoneMobile, String faxe, String email,
			List<AvertissementRedevable> avertissementRedevables, List<Local> locals) {
		super();
		this.id = id;
		this.nomResponsable = nomResponsable;
		this.prenomResponsable = prenomResponsable;
		this.cne = cne;
		this.rc = rc;
		this.ice = ice;
		this.identifiantFiscal = identifiantFiscal;
		this.telephoneFixe = telephoneFixe;
		this.telephoneMobile = telephoneMobile;
		this.faxe = faxe;
		this.email = email;
		this.avertissementRedevables = avertissementRedevables;
		this.locals = locals;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomResponsable() {
		return nomResponsable;
	}

	public void setNomResponsable(String nomResponsable) {
		this.nomResponsable = nomResponsable;
	}

	public String getPrenomResponsable() {
		return prenomResponsable;
	}

	public void setPrenomResponsable(String prenomResponsable) {
		this.prenomResponsable = prenomResponsable;
	}

	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}

	public int getRc() {
		return rc;
	}

	public void setRc(int rc) {
		this.rc = rc;
	}

	public int getIce() {
		return ice;
	}

	public void setIce(int ice) {
		this.ice = ice;
	}

	public int getIdentifiantFiscal() {
		return identifiantFiscal;
	}

	public void setIdentifiantFiscal(int identifiantFiscal) {
		this.identifiantFiscal = identifiantFiscal;
	}

	public String getTelephoneFixe() {
		return telephoneFixe;
	}

	public void setTelephoneFixe(String telephoneFixe) {
		this.telephoneFixe = telephoneFixe;
	}

	public String getTelephoneMobile() {
		return telephoneMobile;
	}

	public void setTelephoneMobile(String telephoneMobile) {
		this.telephoneMobile = telephoneMobile;
	}

	public String getFaxe() {
		return faxe;
	}

	public void setFaxe(String faxe) {
		this.faxe = faxe;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@JsonIgnore
	public List<AvertissementRedevable> getAvertissementRedevables() {
		return avertissementRedevables;
	}

	@JsonSetter
	public void setAvertissementRedevables(List<AvertissementRedevable> avertissementRedevables) {
		this.avertissementRedevables = avertissementRedevables;
	}

	@JsonIgnore
	public List<Local> getLocals() {
		return locals;
	}

	@JsonSetter
	public void setLocals(List<Local> locals) {
		this.locals = locals;
	}

	@Override
	public String toString() {
		return "Redevable [id=" + id + ", nomResponsable=" + nomResponsable + ", prenomResponsable=" + prenomResponsable
				+ ", cne=" + cne + ", rc=" + rc + ", ice=" + ice + ", identifiantFiscal=" + identifiantFiscal
				+ ", telephoneFixe=" + telephoneFixe + ", telephoneMobile=" + telephoneMobile + ", faxe=" + faxe
				+ ", email=" + email + ", avertissementRedevables=" + avertissementRedevables + ", locals=" + locals
				+ "]";
	}

}
