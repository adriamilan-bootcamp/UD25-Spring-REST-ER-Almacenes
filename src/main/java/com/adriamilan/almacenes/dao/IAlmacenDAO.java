package com.adriamilan.almacenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adriamilan.almacenes.dto.Almacen;

public interface IAlmacenDAO extends JpaRepository<Almacen, Long>{

}
