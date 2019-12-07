package com.taxes.communales.boissons.avertissements.model.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taxes.communales.boissons.avertissements.bean.Local;
import com.taxes.communales.boissons.avertissements.model.service.facade.LocalService;

@RestController
@RequestMapping("/taxescommunalesboissons-api/local")
public class LocalRest {

	@Autowired
	private LocalService localService;

	@GetMapping("/unpaidUntilYear/derniereAnneePayee/{derniereAnneePayee}")
	public List<Local> findLocalTaxeUnpaidUntilYear(@PathVariable Integer derniereAnneePayee) {
		return localService.findLocalTaxeUnpaidUntilYear(derniereAnneePayee);
	}
	
	@GetMapping("/unpaidUntilThisYear")
	public List<Local> findLocalTaxeUnpaidUntilThisYear() {
		return localService.findLocalTaxeUnpaidUntilThisYear();
	}
	
	@GetMapping("/findAllLocal")
	public List<Local> findAllLocal() {
		return localService.findAllLocal();
	}
	
	@GetMapping("/findByLastYear-QuarterPaids/derniereAnneePayee/{derniereAnneePayee}/dernierTrimestrePaye/{dernierTrimestrePaye}")
	public List<Local> findByDerniereAnneePayeeAndDerniertrimestrePaye(@PathVariable Integer derniereAnneePayee, @PathVariable Integer dernierTrimestrePaye)
	{
		return localService.findByDerniereAnneePayeeAndDernierTrimestrePaye(derniereAnneePayee, dernierTrimestrePaye);
	}
}
