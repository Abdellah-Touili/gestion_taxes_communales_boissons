package com.taxes.communales.boissons.avertissements.model.service.facade;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.taxes.communales.boissons.avertissements.bean.Local;

public interface LocalService {
	
	public List<Local> findLocalTaxeUnpaidUntilThisYear();

	public List<Local> findLocalTaxeUnpaidUntilYear(int derniereAnneePayee);
	public List<Local> findAllLocal();
	public List<Local> findByDerniereAnneePayeeAndDernierTrimestrePaye(int derniereAnneePayee, int dernierTrimestrePaye);

}
