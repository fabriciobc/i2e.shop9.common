package br.com.i2e.shop9.model;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

@Data
public class ProdutoS9 {
	private String codigo;
	private String nome;
	private String observacao1;
	private String observacao2;
	private String observacao3;
	private Integer tipo;// : 0 ou 1 (Normal, Grade)
	private Integer codigoClasse;
	private Integer codigoSubclasse;
	private Integer codigoCor;
	private Integer codigoTamanho;
	private Integer codigoGrupo;
	private Integer codigoMoeda;
	private Integer codigoFamilia;
	private Integer codigoUnidadeVenda;
	private Integer codigoPesquisa1;
	private Integer codigoPesquisa2;
	private Integer codigoPesquisa3;
	private BigDecimal pesoLiquido;
	private BigDecimal pesoBruto;
	private BigDecimal altura;
	private BigDecimal largura;
	private BigDecimal comprimento;
	private BigDecimal estoqueAtual;
	private Integer codigoFabricante;
	private String codigoBarras;
	private String urlFotos;
	private List<ProdutoS9Foto> fotos;
	/*
	 * urlDetalhe; urlEstoqueDetalhe; urlTabelaPreco; urlPromocoes; urlFotos;
	 */
}
