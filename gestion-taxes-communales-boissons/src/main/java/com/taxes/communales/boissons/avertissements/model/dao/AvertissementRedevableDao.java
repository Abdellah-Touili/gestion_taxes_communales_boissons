package com.taxes.communales.boissons.avertissements.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taxes.communales.boissons.avertissements.bean.AvertissementRedevable;
import com.taxes.communales.boissons.avertissements.bean.Redevable;

@Repository
public interface AvertissementRedevableDao extends JpaRepository<AvertissementRedevable, Long> {

	public <list>AvertissementRedevable findByRedevableId(Long id);
	public <list>AvertissementRedevable findByLocalId(Long id);
	public <list>AvertissementRedevable findByTypeAvertissementId(Long id);
	
}
