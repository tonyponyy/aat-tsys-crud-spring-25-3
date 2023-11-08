package com.example.almacenes.dto;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cajas")
public class Caja {


	// Atributos de la clase
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "contenido") // no es del todo necesario
	private String contenido;
	private int valor;

	   @ManyToOne 
	    @JoinColumn(name = "almacen") 
	    private Almacen almacen;

	// Constructores de clase
	public Caja() {

	}

	public Caja(int id, String contenido, int valor, Almacen almacen) {
		super();
		this.id = id;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	@Override
	public String toString() {
		return "Caja [id=" + id + ", contenido=" + contenido + ", valor=" + valor + ", almacen=" + almacen + "]";
	}





}
