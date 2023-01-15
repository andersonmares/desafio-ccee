package com.anderson.controller;

import com.anderson.dto.AgenteDTO;
import com.anderson.repository.AgenteRepository;
import com.anderson.service.AgenteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;

import static com.anderson.utils.Constants.*;


@RestController
@Slf4j
@CrossOrigin(origins = "*", maxAge = 3600)
@RequiredArgsConstructor
@RequestMapping("/agentes")
public class AgentesController {

    @Autowired
    private AgenteService service;

    @Autowired
    private AgenteRepository repository;

    @PostMapping(value = AGENTE, consumes = APPLICATION_JSON)
    ResponseEntity<?> salvarArquivos(@RequestBody AgenteDTO agenteDTO) {
        try {
            System.out.println(CODIGO_AGENTE + agenteDTO.getCodigo());
            return ResponseEntity.status(HttpStatus.OK).build();

        } catch (Exception e) {
            log.error(ERROR, e);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping("/regiao/{regiao}")
    public List<AgenteDTO> listarPorRegiao(@PathVariable String regiao) {

        try {
            List<AgenteDTO> agente = repository.findByRegioesSigla(regiao);
            return agente;
        } catch (Exception e) {
            log.error(ERROR, e);
            return (List<AgenteDTO>) ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }


    }
}
