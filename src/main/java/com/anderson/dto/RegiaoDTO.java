package com.anderson.dto;

import lombok.Data;

import java.util.List;

@Data
public class RegiaoDTO {

    private String sigla;

    private List<CompraDTO> listaComprasDTO;

    private List<GeracaoDTO> listaGeracoesDTO;

    private List<PrecoMedioDTO> listaPrecosMedioDTO;
}
