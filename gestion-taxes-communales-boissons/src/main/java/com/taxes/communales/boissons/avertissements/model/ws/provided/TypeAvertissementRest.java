package com.taxes.communales.boissons.avertissements.model.ws.provided;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taxes.communales.boissons.avertissements.bean.TypeAvertissement;
import com.taxes.communales.boissons.avertissements.model.service.facade.TypeAvertissementService;

@RestController
@RequestMapping("/taxescommunalesboissons-api/typeAvertissement")
public class TypeAvertissementRest {
	@Autowired
	private TypeAvertissementService typeAvertissementService;

	@PostMapping("/")
	public void save(@RequestBody TypeAvertissement typeAvertissement) {
		typeAvertissementService.save(typeAvertissement);
	}

	@GetMapping("/")
	public List<TypeAvertissement> findAll() {
		return typeAvertissementService.findAll();
	}

	@GetMapping("/id/{id}")
	public Optional<TypeAvertissement> findById(@PathVariable Long id) {
		return typeAvertissementService.findById(id);
	}

	@GetMapping("/libelle/{libelle}")
	public TypeAvertissement findByLibelle(@PathVariable String libelle) {
		return typeAvertissementService.findByLibelle(libelle);
	}
	
	@PutMapping("/id/{id}")
	public  TypeAvertissement updateById(@RequestBody TypeAvertissement newtypeAvertissement, @PathVariable Long id)
	{
		return typeAvertissementService.updateById(newtypeAvertissement,id);
	}

	/*
	 * @PutMapping("/id/{id}") public TypeAvertissement updateById(@PathVariable
	 * Long id) { return typeAvertissementService.updateById(id); }
	 */

	@DeleteMapping("/delete/{id}")
	public void deletebyId(@PathVariable Long id) {
		typeAvertissementService.deleteById(id);
	}

	/*
	@PutMapping("/update/{id}")
	public TypeAvertissement updateTypeAvertissement(@RequestBody TypeAvertissement newtypeAvertissement, @PathVariable Long id)
	{
		typeAvertissementService.updateTypeAvertissement(newtypeAvertissement,id);
		return newtypeAvertissement;
	}
	*/

}