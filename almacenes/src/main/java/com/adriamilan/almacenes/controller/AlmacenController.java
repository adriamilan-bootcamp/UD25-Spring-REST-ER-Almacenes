package com.adriamilan.almacenes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adriamilan.almacenes.dto.Almacen;
import com.adriamilan.almacenes.service.AlmacenServiceImpl;

@RestController
@RequestMapping("/api")
public class AlmacenController {

	@Autowired
	AlmacenServiceImpl almacenService;
	
	@GetMapping("/almacenes")
	public List<Almacen> listAlmacenes() {
		return almacenService.listAlmacenes();
	}
	
	@GetMapping("/almacen/{id}")
	public Almacen almacenXID(@PathVariable(name="id") Long id) {
		return almacenService.almacenXID(id);
	}
	
	@PostMapping("/almacen")
	public Almacen saveAlmacen(@RequestBody Almacen almacen) {
		return almacenService.saveAlmacen(almacen);
	}
	
	@PutMapping("/almacen/{id}")
	public Almacen editAlmacen(@PathVariable(name="id") Long id, @RequestBody Almacen almacen) {
		Almacen almacenSelected = new Almacen();
		Almacen almacenUpdated = new Almacen();
	
		almacenSelected = almacenService.almacenXID(id);
		almacenSelected.setLugar(almacen.getLugar());
		almacenSelected.setCapacidad(almacen.getCapacidad());
		
		almacenUpdated = almacenService.saveAlmacen(almacenSelected);
		
		return almacenUpdated;
	}
	
	@DeleteMapping("/almacen/{id}")
	public void deleteAlmacen(@PathVariable(name="id") Long id) {
		almacenService.deleteAlmacen(id);
	}
	
}
