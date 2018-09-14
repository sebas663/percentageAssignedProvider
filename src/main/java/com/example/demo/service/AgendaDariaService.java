package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.AgendaDiaria;
import com.example.demo.Result;
import com.example.demo.repository.AgendaDiariaRepo;

@Service
public class AgendaDariaService {
	
	@Autowired
	PercentageService percentageService;
	
	@Autowired
	AgendaDiariaRepo agendaDiariaRepo;
	
	public Result getData(Integer idAgenda, String codigoPrestadora, String fecha) {
		Result result = new Result();

		String str[] = fecha.split("/");

		int day = Integer.parseInt(str[0]);
		int month = Integer.parseInt(str[1]);
		int year = Integer.parseInt(str[2]);

		List<AgendaDiaria> lst = agendaDiariaRepo.getAllByMonth(year, month);

		boolean superaPorcentaje = percentageService.superaPorcentaje(lst, codigoPrestadora);
		result.setSuperoPorcentaje(superaPorcentaje);
		result.setAgendasDiarias(marcarFechaConsultada(lst, day));
		result.setEsEstricto(true);
		return result;
	}
	
	private List<AgendaDiaria> marcarFechaConsultada(List<AgendaDiaria> lst, int day){
		for(AgendaDiaria a:lst){
			if(a.getDia() == day){
				a.setEsFechaConsultada(true);
			}
		}
		return lst;
	}
}
