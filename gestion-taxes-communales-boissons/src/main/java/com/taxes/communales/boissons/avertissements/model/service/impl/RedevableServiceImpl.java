package com.taxes.communales.boissons.avertissements.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taxes.communales.boissons.avertissements.bean.Redevable;
import com.taxes.communales.boissons.avertissements.model.dao.RedevableDao;
import com.taxes.communales.boissons.avertissements.model.service.facade.RedevableService;

@Service
public class RedevableServiceImpl implements RedevableService {
	
	@Autowired
	private RedevableDao redevableDao;
	
	@Override
	public List<Redevable> findRedevableWithAvertissement(){
		return redevableDao.findRedevableWithAvertissement();
		
	}

}
