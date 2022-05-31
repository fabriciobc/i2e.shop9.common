package br.com.i2e.shop9.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;
@Data
public class RecebimemtoVenda {
	private BigDecimal valorParcelas;
	private BigDecimal valor;
	private Integer codigoContaBancaria;
	private LocalDate vencimento;
	private Integer codigoAdministradora;
	private String nsu;
	private Integer quantidadeParcelas;
	private String numeroCartao;
	//  B, C, CB ou CR (Boleto, Cartão de Crédito ou Conta Bancária, Credito de Cliente)
	private String tipo; 
}
