package br.com.i2e.shop9.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;

@Data
public class VendaS9 {
	private Long codigoCliente;
	private String cpfCnpj;
	private Integer codigoOperacao;
	private Integer	codigoCaixa;
	private LocalDate data;
	private String observacao;
	private BigDecimal descontoTotalGeral;
	private Integer codigoVendedor1;
	private Integer codigoVendedor2;
	private ProdutoVenda produtos;
	private RecebimemtoVenda recebimentos;
	private EntregaVenda dadosEntrega; 
}
