package com.example.demo;

import java.util.List;

public class ProviderPercentageConfig {
	private List<ProviderGroup> providersGroups;

	public Double getPercentajeByCodPrestadora(String codigoPrestadora) {
		Double result = 0D;
		for (ProviderGroup p : providersGroups) {
			if (p.getProvidersCodes().contains(codigoPrestadora)) {
				result = p.getPercentaje();
			}
		}
		return result;
	}
	
	public List<ProviderGroup> getProvidersGroups() {
		return providersGroups;
	}

	public void setProvidersGroups(List<ProviderGroup> providersGroups) {
		this.providersGroups = providersGroups;
	}
	
}
