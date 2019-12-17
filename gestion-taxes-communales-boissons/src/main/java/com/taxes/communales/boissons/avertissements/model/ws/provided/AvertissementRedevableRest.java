package com.taxes.communales.boissons.avertissements.model.ws.provided;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taxes.communales.boissons.avertissements.bean.AvertissementRedevable;
import com.taxes.communales.boissons.avertissements.model.service.facade.AvertissementRedevableService;

@RestController
@RequestMapping("/taxescommunalesboissons-api/avertissement")
public class AvertissementRedevableRest {
	@Autowired
	private AvertissementRedevableService avertissementRedevableService;

	@PostMapping("/")
	public void save(@RequestBody AvertissementRedevable avertissementRedevable) {
		avertissementRedevableService.save(avertissementRedevable);
	}

	@GetMapping("/")
	public List<AvertissementRedevable> findAll() {
		return avertissementRedevableService.findAll();
	}
	
	@GetMapping("/id/{id}")
	public Optional <AvertissementRedevable> findById(@PathVariable Long id) {
		return avertissementRedevableService.findById(id);
	}

	@GetMapping("/redevable/{id}")
	public <list>AvertissementRedevable findByRedevableId(@PathVariable Long id) {
		return avertissementRedevableService.findByRedevableId(id);
	}

	@GetMapping("/local/{id}")
	public <list>AvertissementRedevable findByLocalId(@PathVariable Long id) {
		return avertissementRedevableService.findByLocalId(id);
	}

	@GetMapping("/type-avertissement/{id}")
	public <list>AvertissementRedevable findByTypeAvertissementId(@PathVariable Long id) {
		return avertissementRedevableService.findByTypeAvertissementId(id);
	}

	@GetMapping("/redevable-local/")
	public List<AvertissementRedevable> findAvertissementByRedevablaAndLocal() {
		return avertissementRedevableService.findAvertissementByRedevablaAndLocal();
	}
	
}
