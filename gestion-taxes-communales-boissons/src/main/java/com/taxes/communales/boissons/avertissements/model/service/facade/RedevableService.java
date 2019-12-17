package com.taxes.communales.boissons.avertissements.model.service.facade;

import java.util.List;

import com.taxes.communales.boissons.avertissements.bean.Redevable;

public interface RedevableService {
	
	public List<Redevable> findRedevableWithAvertissement();

}
