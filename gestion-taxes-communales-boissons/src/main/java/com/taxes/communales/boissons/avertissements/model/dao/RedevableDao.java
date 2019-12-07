package com.taxes.communales.boissons.avertissements.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taxes.communales.boissons.avertissements.bean.Redevable;

@Repository
public interface RedevableDao extends JpaRepository <Redevable, Long>{

}