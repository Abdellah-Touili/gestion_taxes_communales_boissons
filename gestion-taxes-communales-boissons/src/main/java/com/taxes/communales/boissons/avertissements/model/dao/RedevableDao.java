package com.taxes.communales.boissons.avertissements.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.taxes.communales.boissons.avertissements.bean.AvertissementRedevable;
import com.taxes.communales.boissons.avertissements.bean.Redevable;

@Repository
public interface RedevableDao extends JpaRepository <Redevable, Long>{
	
	
	@Query(value = "SELECT advRedev.* FROM avertissement_redevable advRedev WHERE (advRedev.redevable =2 AND advRedev.local =1)", nativeQuery=true)
	public List<AvertissementRedevable> findAvertissementByRedevablaAndLocal();
	
	@Query(value = "SELECT redev.* FROM redevable redev WHERE redev.id IN (Select advRedev.redevable From avertissement_redevable advRedev)",nativeQuery=true)
	public List<Redevable> findRedevableWithAvertissement();
	
}