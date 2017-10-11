package com.dentina.repository;

import org.springframework.data.repository.CrudRepository;

import com.dentina.domain.Paciente;

public interface PacienteRepository extends CrudRepository<Paciente, Long>{

}
