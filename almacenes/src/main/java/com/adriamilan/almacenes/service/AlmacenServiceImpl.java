package com.adriamilan.almacenes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriamilan.almacenes.dao.IAlmacenDAO;
import com.adriamilan.almacenes.dto.Almacen;

@Service
public class AlmacenServiceImpl implements IAlmacenService {

	@Autowired
	IAlmacenDAO almacenDao;

	@Override
	public List<Almacen> listAlmacenes() {
		return almacenDao.findAll();
	}

	@Override
	public Almacen almacenXID(Long id) {
		return almacenDao.findById(id).get();
	}

	@Override
	public Almacen saveAlmacen(Almacen almacen) {
		return almacenDao.save(almacen);
	}

	@Override
	public Almacen editAlmacen(Almacen almacen) {
		return almacenDao.save(almacen);
	}

	@Override
	public void deleteAlmacen(Long id) {
		almacenDao.deleteById(id);
	}

}
