package br.com.i2e.shop9.model;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ProdutoVenda {
	private String codigo;
	private String codigoCor;
	private String codigoTamanho;
	private BigDecimal quantidade;
	private BigDecimal precoUnitario;
	private BigDecimal descontoUnitario;
}
