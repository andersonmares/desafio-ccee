package com.anderson.dto;

import lombok.Data;

import java.util.List;

@Data
public class AgenteDTO {

    private Long codigo;

    private String data;

    private List<RegiaoDTO> listaRegioesDTO;
}
