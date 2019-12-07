package com.taxes.communales.boissons.avertissements.model.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taxes.communales.boissons.avertissements.bean.TypeAvertissement;
import com.taxes.communales.boissons.avertissements.model.dao.TypeAvertissementDao;
import com.taxes.communales.boissons.avertissements.model.service.facade.TypeAvertissementService;

@Service
public class TypeAvertissementServiceImpl implements TypeAvertissementService {

	@Autowired
	private TypeAvertissementDao typeAvertissementDao;

	@Override
	public void save(TypeAvertissement typeAvertissement) {
		typeAvertissementDao.save(typeAvertissement);

	}

	@Override
	public List<TypeAvertissement> findAll() {
		return typeAvertissementDao.findAll();
	}

	@Override
	public Optional<TypeAvertissement> findById(Long id) {
		return typeAvertissementDao.findById(id);
	}

	@Override
	public TypeAvertissement findByLibelle(String libelle) {
		return typeAvertissementDao.findByLibelle(libelle);
	}

	@Override
	public void deleteById(Long id) {
		typeAvertissementDao.deleteById(id);
	}

	
	public TypeAvertissement updateById(TypeAvertissement newtypeAvertissement, Long id) {
//		return typeAvertissementDao.findById(id).map(typeAvertissement -> {
//			typeAvertissement.setId(newtypeAvertissement.getId());
//			typeAvertissement.setLibelle(newtypeAvertissement.getLibelle());
//			return typeAvertissementDao.save(typeAvertissement);
//			
//		}).orElseGet(() -> {
//			newtypeAvertissement.setId(id);
//            return typeAvertissementDao.save(newtypeAvertissement);
//        });
			
		TypeAvertissement typeAvertissement = findById(id).get();
		if(typeAvertissement==null) {
			//newtypeAvertissement.setId(id);
			//newtypeAvertissement.setId(id);
			typeAvertissementDao.save(newtypeAvertissement);
		}else {
			typeAvertissement.setLibelle(newtypeAvertissement.getLibelle());
			typeAvertissementDao.save(typeAvertissement);
		}
			
		return typeAvertissement;

	}

	

}