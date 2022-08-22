package com.adriamilan.almacenes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriamilan.almacenes.dao.ICajaDAO;
import com.adriamilan.almacenes.dto.Caja;

@Service
public class CajaServiceImpl implements ICajaService {

	@Autowired
	ICajaDAO cajaDao;
	
	@Override
	public List<Caja> listCajas() {
		return cajaDao.findAll();
	}

	@Override
	public Caja cajaXID(Long id) {
		return cajaDao.findById(id).get();
	}

	@Override
	public Caja saveCaja(Caja caja) {
		return cajaDao.save(caja);
	}

	@Override
	public Caja editCaja(Caja caja) {
		return cajaDao.save(caja);
	}

	@Override
	public void deleteCaja(Long id) {
		cajaDao.deleteById(id);
	}

}
