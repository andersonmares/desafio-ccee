package com.anderson.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;


@Getter
@Setter
@Entity
public class Agente {

	@Id
	private Long codigo;
	private String data;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Regiao> regioes;
}
