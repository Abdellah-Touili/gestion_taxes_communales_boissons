package com.taxes.communales.boissons.avertissements.model.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.web.bind.annotation.PathVariable;

import com.taxes.communales.boissons.avertissements.bean.TypeAvertissement;

@Repository
public interface TypeAvertissementDao extends JpaRepository<TypeAvertissement, Long> {

	// public TypeAvertissement findById(Long id);

	public TypeAvertissement findByLibelle(String libelle);
//
//	public Optional<TypeAvertissement> updateTypeAvertissement(TypeAvertissement newtypeAvertissement, Long id);

}