package com.taxes.communales.boissons.avertissements.model.service.impl;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.taxes.communales.boissons.avertissements.bean.Local;
import com.taxes.communales.boissons.avertissements.model.dao.LocalDao;
import com.taxes.communales.boissons.avertissements.model.service.facade.LocalService;



@Service
public class LocalServiceImpl implements LocalService {
	
	@Autowired
	private LocalDao localDao;

	@Override
	public List<Local> findLocalTaxeUnpaidUntilThisYear() {
		int thisYear = Calendar.getInstance().get(Calendar.YEAR);
		return localDao.findByDerniereAnneePayeeLessThan(thisYear);
	}
	
	@Override
	public List<Local> findLocalTaxeUnpaidUntilYear(int derniereAnneePayee) {
		return localDao.findByDerniereAnneePayeeLessThan(derniereAnneePayee);
	}

	@Override
	public List<Local> findAllLocal() {
		return localDao.findAllLocal();
	}
	
	@Override
	public List<Local> findByDerniereAnneePayeeAndDernierTrimestrePaye(int derniereAnneePayee, int dernierTrimestrePaye)
	{
		return localDao.findByDerniereAnneePayeeAndDernierTrimestrePaye(derniereAnneePayee, dernierTrimestrePaye);
	}
	
}
