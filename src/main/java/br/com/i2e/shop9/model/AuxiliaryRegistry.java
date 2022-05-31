package br.com.i2e.shop9.model;

import lombok.Data;
@Data
public class AuxiliaryRegistry {
	public enum Type { CLASSES, SUBCLASSES, GRUPOS, FAMILIAS, FABRICANTES, UNIDADES_VENDA, CORES, 
		TAMANHOS, MOEDAS, PESQUISA_1, PESQUISA_2, PESQUISA_3 }

	private String codigo;
	private String nome;
	private String tipo;
	private Type type;
}
