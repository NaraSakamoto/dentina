package com.dentina.controller;

import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dentina.model.PacienteModel;
import com.dentina.repository.PacienteRepository;

/**
 * Recebe requisições relacionadas ao paciente.
 * 
 * @author Nara
 *
 */
@RestController
@RequestMapping("paciente")
public class PacienteController {

	private static Logger LOG = Logger.getLogger(PacienteController.class.getName());

	@Autowired
	private PacienteRepository pacienteRepository;
	
	
	/**
	 * Valida o paciente recebido e insere/atualiza caso seja válido.
	 * 
	 * @param model
	 */
	@RequestMapping(method=RequestMethod.POST, consumes="application/json")
	public void insereOuAtualiza(@RequestBody @Valid PacienteModel model){
		
	}
}
