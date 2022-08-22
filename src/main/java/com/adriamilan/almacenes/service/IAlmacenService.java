package com.adriamilan.almacenes.service;

import java.util.List;

import com.adriamilan.almacenes.dto.Almacen;

public interface IAlmacenService {

	public List<Almacen> listAlmacenes();
	
	public Almacen almacenXID(Long id);
	
	public Almacen saveAlmacen(Almacen almacen);
	
	public Almacen editAlmacen(Almacen almacen);
	
	public void deleteAlmacen(Long id);
	
}
