package com.taxes.communales.boissons.avertissements.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;


@Entity
public class AvertissementRedevable  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	private Redevable redevable ;

	@ManyToOne
	private Local local;

	@ManyToOne
	private TypeAvertissement typeAvertissement;

	/*@Temporal(TemporalType.DATE)
	private Date dateAvertissement;
*/
	
	private String dateAvertissement;
	
	public AvertissementRedevable() {
		super();
	}

	public AvertissementRedevable(Long id, Redevable redevable, Local local, TypeAvertissement typeAvertissement,
			String dateAvertissement) {
		super();
		this.id = id;
		this.redevable = redevable;
		this.local = local;
		this.typeAvertissement = typeAvertissement;
		this.dateAvertissement = dateAvertissement;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public Redevable getRedevable() {
		return redevable;
	}


	public void setRedevable(Redevable redevable) {
		this.redevable = redevable;
	}


	public Local getLocal() {
		return local;
	}
	

	public void setLocal(Local local) {
		this.local = local;
	}
    
	public TypeAvertissement getTypeAvertissement() {
		return typeAvertissement;
	}

	public void setTypeAvertissement(TypeAvertissement typeAvertissement) {
		this.typeAvertissement = typeAvertissement;
	}

	public String getDateAvertissement() {
		return dateAvertissement;
	}

	public void setDateAvertissement(String dateAvertissement) {
		this.dateAvertissement = dateAvertissement;
	}

	@Override
	public String toString() {
		return "AvertissementRedevable [id=" + id + ", redevable=" + redevable + ", local=" + local
				+ ", typeAvertissement=" + typeAvertissement + ", dateAvertissement=" + dateAvertissement + "]";
	}


}
