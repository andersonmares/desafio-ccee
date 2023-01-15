package com.anderson.repository;

import com.anderson.dto.AgenteDTO;
import com.anderson.model.Agente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface AgenteRepository extends JpaRepository<Agente, Long> {

	List<AgenteDTO> findByRegioesSigla(String regiao);


}
