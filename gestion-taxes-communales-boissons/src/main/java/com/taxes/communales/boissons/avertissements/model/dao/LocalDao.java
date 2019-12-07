package com.taxes.communales.boissons.avertissements.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.taxes.communales.boissons.avertissements.bean.Local;;

@Repository
public interface LocalDao extends JpaRepository<Local, Long> {

	public List<Local> findByDerniereAnneePayeeLessThan(int derniereAnneePayee);
	//public List<Local> findLocalTaxeUnpaidUntilThisYear();
	
	//@Query("SELECT l FROM Local l WHERE derniereAnneePayee = ?1 AND dernierTrimestrePaye = ?2")
	public List<Local> findByDerniereAnneePayeeAndDernierTrimestrePaye(Integer derniereAnneePayee, Integer dernierTrimestrePaye);

	@Query("SELECT l FROM Local l WHERE l.derniereAnneePayee = 2018")
	public List<Local> findAllLocal();
}