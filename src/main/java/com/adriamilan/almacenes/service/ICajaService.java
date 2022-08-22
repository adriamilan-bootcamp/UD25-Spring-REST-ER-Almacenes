package com.adriamilan.almacenes.service;

import java.util.List;

import com.adriamilan.almacenes.dto.Caja;

public interface ICajaService {

	public List<Caja> listCajas();
	
	public Caja cajaXID(Long id);
	
	public Caja saveCaja(Caja caja);
	
	public Caja editCaja(Caja caja);
	
	public void deleteCaja(Long id);
	
}
