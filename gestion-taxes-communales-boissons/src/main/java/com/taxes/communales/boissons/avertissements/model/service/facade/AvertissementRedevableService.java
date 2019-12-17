package com.taxes.communales.boissons.avertissements.model.service.facade;

import java.util.List;
import java.util.Optional;

import com.taxes.communales.boissons.avertissements.bean.AvertissementRedevable;
import com.taxes.communales.boissons.avertissements.bean.Local;
import com.taxes.communales.boissons.avertissements.bean.Redevable;
import com.taxes.communales.boissons.avertissements.bean.TypeAvertissement;

public interface AvertissementRedevableService {

	public void save(AvertissementRedevable avertissementRedevable);
	public List<AvertissementRedevable> findAll();
	public Optional <AvertissementRedevable> findById(Long id);

	public <list>AvertissementRedevable findByRedevableId(Long id);

	public <list>AvertissementRedevable findByLocalId(Long id);

	public <list>AvertissementRedevable findByTypeAvertissementId(Long id);
	
	public List<AvertissementRedevable> findAvertissementByRedevablaAndLocal();
   
}
