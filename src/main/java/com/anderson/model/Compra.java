package com.anderson.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Entity
public class Compra {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE )
	private Long id;
	
	@ElementCollection
	@CollectionTable(name="valores_compra")
	private List<BigDecimal> valor;
}
