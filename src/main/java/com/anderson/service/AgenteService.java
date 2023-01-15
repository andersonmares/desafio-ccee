package com.anderson.service;

import java.util.List;

import com.anderson.dto.AgenteDTO;
import com.anderson.model.Agente;
import com.anderson.repository.AgenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class AgenteService {
	
	private final AgenteRepository repository;


	public Agente save(Agente agente) {
		return repository.save(agente);
	}
	
	public List<AgenteDTO> findByRegiao(String regiao) {
		return repository.findByRegioesSigla(regiao);
	}
}
