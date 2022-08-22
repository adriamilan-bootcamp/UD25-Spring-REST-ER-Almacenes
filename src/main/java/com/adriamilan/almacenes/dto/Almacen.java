package com.adriamilan.almacenes.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Almacen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="lugar")
	private String lugar;
	
	@Column(name="capacidad")
	private int capacidad;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "almacen")
	private List<Caja> cajas;
	
	// Constructor por defecto
	public Almacen() {
		
	}

	/**
	 * @param id
	 * @param lugar
	 * @param capacidad
	 */
	public Almacen(Long id, String lugar, int capacidad) {
		super();
		this.id = id;
		this.lugar = lugar;
		this.capacidad = capacidad;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the lugar
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * @param lugar the lugar to set
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	/**
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Caja")
	public List<Caja> getCajas() {
		return cajas;
	}
	
	public void setCajas(List<Caja> caja) {
		this.cajas = caja;
	}
	
	@Override
	public String toString() {
		return "Almacen [id=" + id + ", lugar=" + lugar + ", capacidad=" + capacidad + "]";
	}
	
}
