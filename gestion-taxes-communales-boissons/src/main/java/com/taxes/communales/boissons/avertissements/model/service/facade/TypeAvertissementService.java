package com.taxes.communales.boissons.avertissements.model.service.facade;

import java.util.List;
import java.util.Optional;

import com.taxes.communales.boissons.avertissements.bean.TypeAvertissement;

public interface TypeAvertissementService {
	
	public void save(TypeAvertissement typeAvertissementService);
	public List<TypeAvertissement> findAll();	
	
	public Optional<TypeAvertissement> findById(Long id);
	public TypeAvertissement findByLibelle(String libelle);

	//public TypeAvertissement updateById(Long id);
	
    public void deleteById(Long id);
	
	public TypeAvertissement updateById(TypeAvertissement newtypeAvertissement, Long id);
	 
	
}


