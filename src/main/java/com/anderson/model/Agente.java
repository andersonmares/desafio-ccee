package com.anderson.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@Entity
@Data
@Table(name = "agente")
public class Agente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long codigo;

	@Column(name = "data")
	private String data;

	@OneToMany(cascade = CascadeType.ALL)
	@Column(name = "regioes")
	private List<Regiao> regioes;
}
