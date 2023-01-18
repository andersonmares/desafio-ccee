package com.anderson.service;

import com.anderson.dto.AgenteDTO;
import com.anderson.model.Agente;
import com.anderson.repository.AgenteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


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
