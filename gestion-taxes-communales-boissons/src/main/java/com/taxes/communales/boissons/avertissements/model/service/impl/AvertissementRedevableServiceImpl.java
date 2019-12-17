package com.taxes.communales.boissons.avertissements.model.service.impl;

//import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taxes.communales.boissons.avertissements.bean.AvertissementRedevable;

import com.taxes.communales.boissons.avertissements.model.dao.AvertissementRedevableDao;
import com.taxes.communales.boissons.avertissements.model.service.facade.AvertissementRedevableService;

@Service
public class AvertissementRedevableServiceImpl implements AvertissementRedevableService {

	@Autowired
	private AvertissementRedevableDao avertissementRedevableDao;

	@Override
	public void save(AvertissementRedevable avertissementRedevable) {
		avertissementRedevableDao.save(avertissementRedevable);

	}

	@Override
	public List<AvertissementRedevable> findAll() {
		return avertissementRedevableDao.findAll();
	}

	@Override
	public Optional<AvertissementRedevable> findById(Long id) {
		return avertissementRedevableDao.findById(id);
	}

	@Override
	public <list> AvertissementRedevable findByRedevableId(Long id) {
		return avertissementRedevableDao.findByRedevableId(id);
	}

	@Override
	public <list> AvertissementRedevable findByLocalId(Long id) {
		return avertissementRedevableDao.findByLocalId(id);
	}

	@Override
	public <list> AvertissementRedevable findByTypeAvertissementId(Long id) {
		return avertissementRedevableDao.findByTypeAvertissementId(id);
	}

	@Override
	public List<AvertissementRedevable> findAvertissementByRedevablaAndLocal() {
		// TODO Auto-generated method stub
		return avertissementRedevableDao.findAvertissementByRedevablaAndLocal();
	}
	

}
