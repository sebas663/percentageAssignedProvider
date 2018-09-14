package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.AgendaDiaria;
import com.example.demo.ProviderPercentageConfig;

@Service
public class PercentageService {


	public boolean superaPorcentaje(List<AgendaDiaria> lst, String codigoPrestadora){
		ProviderPercentageConfig config = new ProviderPercentageConfig();
		Double porcentajeTotal;
		Double porcentajeDado;
	    Integer total = 0;
		Integer totalDados = 0;
		porcentajeTotal = config.getPercentajeByCodPrestadora(codigoPrestadora);
		for(AgendaDiaria a:lst){
			total += a.getTurnosTotal();
			totalDados += a.getTotalDadosByCodPrestadora(codigoPrestadora);
		}
		porcentajeDado = (double) (totalDados * 100 / total);
		return porcentajeDado > porcentajeTotal;
	}
}
