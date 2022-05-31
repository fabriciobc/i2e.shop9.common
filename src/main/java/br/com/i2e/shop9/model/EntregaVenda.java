package br.com.i2e.shop9.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;

@Data
public class EntregaVenda {
	private BigDecimal valor;
	// C, E, D, O (Pegar informação do cadastro de cliente, Sempre pelo Emitente, 
	// Sempre pelo Destinatário, Decidido pelo Operador)
	private String opcoesFretePagoPor;
	private BigDecimal pesoBruto;
	private BigDecimal pesoLiquido;
	private BigDecimal volume;
	private LocalDate dataEntrega;
	private String cnpjTransportadora;
	private Boolean naoSomarFreteTotalNota;
	private EnderecoEntrega outroEndereco;
}
