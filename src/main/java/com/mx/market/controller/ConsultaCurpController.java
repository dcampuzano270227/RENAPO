package com.mx.market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.market.model.RequestConsultaCurp;
import com.mx.market.model.ResponseConsultaCurp;
import com.mx.market.model.ResponseServer;
import com.mx.market.service.ConsultaCurpService;

@RestController
@RequestMapping("/CurpDavid")
public class ConsultaCurpController {
	@Autowired
	private ConsultaCurpService consultaCurpService;
	@PostMapping("/consultaCurp")
	
	public ResponseServer consultaCurp(@RequestBody RequestConsultaCurp request) {
		ResponseConsultaCurp responsecurp = new ResponseConsultaCurp();
		ResponseServer respServer = new ResponseServer();
		responsecurp = consultaCurpService.consultacurp(request.getCurp());
		
		if (responsecurp != null) {
			respServer.setCodigo(200);
			respServer.setDescripcion("exito");
			respServer.setData(responsecurp);
		} else {
			respServer.setCodigo(500);
			respServer.setDescripcion("error");
			respServer.setData(null);
		}
	
		
		return respServer;
	}

}
