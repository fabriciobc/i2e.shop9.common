package br.com.i2e.shop9.model;

import java.time.LocalDate;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data@NoArgsConstructor@RequiredArgsConstructor
public class Shop9IntegrationMessage {
	public static final Shop9IntegrationMessage EMPTY_REQUEST = new Shop9IntegrationMessage(Shop9IntegrationMessage.CATEGORIA.EMPTY);

	public enum CATEGORIA {
		PRODUTOS, DETALHE_PRODUTO, CLIENTE, FAMILIA, EMPTY;
	}
	public enum STATUS {
		PREPARADO, PRONTO, ERRO;
	}
	
	private String traceabilityCode;
	private @NonNull CATEGORIA categoria;
	private String tipo;
	private String codigo;
	private LocalDate dataDe;
	private LocalDate dataAte;
	private String info;
	private STATUS status; 
}