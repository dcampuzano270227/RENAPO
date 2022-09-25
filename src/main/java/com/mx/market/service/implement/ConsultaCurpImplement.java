package com.mx.market.service.implement;

import org.springframework.stereotype.Service;

import com.mx.market.model.ResponseConsultaCurp;
import com.mx.market.service.ConsultaCurpService;

@Service
public class ConsultaCurpImplement implements ConsultaCurpService {

	@Override
	public ResponseConsultaCurp consultacurp(String curp) {
		ResponseConsultaCurp datoscurp = new ResponseConsultaCurp();
		if(curp.equals("CASD930227HMLV0")){
			datoscurp.setNombre("David Alejandro");
			datoscurp.setApellidop("Campuzano");
			datoscurp.setApellidom("Salazar");
			datoscurp.setEdad(29);
			datoscurp.setEscolaridad("Ingenieria");
			datoscurp.setNacionalidad("Mexicana");
			datoscurp.setVacunado(true);
		} else {
			return null;
		}
		return datoscurp;
	}

}
