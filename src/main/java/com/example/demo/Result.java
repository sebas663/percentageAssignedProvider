package com.example.demo;

import java.util.List;

public class Result {
	//este deberia sacarse de la configuracion de la agenda
	private Boolean esEstricto;
	
	private Boolean superoPorcentaje;
	List<AgendaDiaria> agendasDiarias;
	
	public Boolean getEsEstricto() {
		return esEstricto;
	}
	public void setEsEstricto(Boolean esEstricto) {
		this.esEstricto = esEstricto;
	}
	public Boolean getSuperoPorcentaje() {
		return superoPorcentaje;
	}
	public void setSuperoPorcentaje(Boolean superoPorcentaje) {
		this.superoPorcentaje = superoPorcentaje;
	}
	public List<AgendaDiaria> getAgendasDiarias() {
		return agendasDiarias;
	}
	public void setAgendasDiarias(List<AgendaDiaria> agendasDiarias) {
		this.agendasDiarias = agendasDiarias;
	}
	
	
}
