package com.adriamilan.almacenes.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Caja {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="numero_referencia")
	private int numeroReferencia;
	
	@Column(name="contenido")
	private String contenido;
	
	@Column(name="valor")
	private int valor;
	
	@ManyToOne
	@JoinColumn(name="almacen")
	private Almacen almacen;
	
	// Constructor por defecto
	public Caja() {
		
	}

	/**
	 * @param id
	 * @param numeroReferencia
	 * @param contenido
	 * @param valor
	 * @param almacen
	 */
	public Caja(Long id, int numeroReferencia, String contenido, int valor, Almacen almacen) {
		super();
		this.id = id;
		this.numeroReferencia = numeroReferencia;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	/**
	 * @return the numeroReferencia
	 */
	public int getNumeroReferencia() {
		return numeroReferencia;
	}

	/**
	 * @param numeroReferencia the numeroReferencia to set
	 */
	public void setNumeroReferencia(int numeroReferencia) {
		this.numeroReferencia = numeroReferencia;
	}

	/**
	 * @return the contenido
	 */
	public String getContenido() {
		return contenido;
	}

	/**
	 * @param contenido the contenido to set
	 */
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}

	/**
	 * @return the almacen
	 */
	public Almacen getAlmacen() {
		return almacen;
	}

	/**
	 * @param almacen the almacen to set
	 */
	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Caja [id=" + id + ", numeroReferencia=" + numeroReferencia + ", contenido=" + contenido + ", valor="
				+ valor + ", almacen=" + almacen + "]";
	}
	
}
