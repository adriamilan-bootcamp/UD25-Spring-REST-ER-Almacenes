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

import com.adriamilan.almacenes.dto.Caja;
import com.adriamilan.almacenes.service.CajaServiceImpl;

@RestController
@RequestMapping("/api")
public class CajaController {

	@Autowired
	CajaServiceImpl cajaService;
	
	@GetMapping("/cajas")
	public List<Caja> listCajas() {
		return cajaService.listCajas();
	}
	
	@GetMapping("/caja/{id}")
	public Caja cajaXID(@PathVariable(name="id") Long id) {
		return cajaService.cajaXID(id);
	}
	
	@PostMapping("/caja")
	public Caja saveCaja(@RequestBody Caja caja) {
		return cajaService.saveCaja(caja);
	}
	
	@PutMapping("/caja/{id}")
	public Caja editCaja(@PathVariable(name="id") Long id, @RequestBody Caja caja) {
		Caja cajaSelected = new Caja();
		Caja cajaUpdated = new Caja();
		
		cajaSelected = cajaService.cajaXID(id);
		cajaSelected.setContenido(caja.getContenido());
		cajaSelected.setNumeroReferencia(caja.getNumeroReferencia());
		cajaSelected.setValor(caja.getValor());
		cajaSelected.setAlmacen(caja.getAlmacen());
		
		cajaUpdated = cajaService.saveCaja(cajaSelected);
		
		return cajaUpdated;
	}
	
	@DeleteMapping("/caja/{id}")
	public void deleteCaja(@PathVariable(name="id") Long id) {
		cajaService.deleteCaja(id);
	}
	
}
