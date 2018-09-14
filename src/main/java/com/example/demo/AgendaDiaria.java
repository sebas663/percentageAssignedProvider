package com.example.demo;

import java.util.List;

public class AgendaDiaria {
	private Integer anio;
	private Integer mes;
	private Integer dia;;
	private List<Turno> turnos;
	private boolean esFechaConsultada;
	
	
	public Integer getTurnosTotal() {
		return turnos != null ? turnos.size() : 0;
	}
	
	public Integer getTotalDadosByCodPrestadora(String codigoPrestadora) {
		int total = 0;
		for (Turno t : turnos) {
			if (t.getEstado().equals("dado") && t.getCodigoPrestadora().equals(codigoPrestadora)) {
				total += 1;
			}
		}
		return total;
	}
	
	public Integer getAnio() {
		return anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	public Integer getMes() {
		return mes;
	}
	public void setMes(Integer mes) {
		this.mes = mes;
	}
	public Integer getDia() {
		return dia;
	}
	public void setDia(Integer dia) {
		this.dia = dia;
	}
	
	public List<Turno> getTurnos() {
		return turnos;
	}
	public void setTurnos(List<Turno> turnos) {
		this.turnos = turnos;
	}
	public boolean isEsFechaConsultada() {
		return esFechaConsultada;
	}
	public void setEsFechaConsultada(boolean esFechaConsultada) {
		this.esFechaConsultada = esFechaConsultada;
	}


	
}
