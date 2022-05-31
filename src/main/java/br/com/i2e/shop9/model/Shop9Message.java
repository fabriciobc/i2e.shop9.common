package br.com.i2e.shop9.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data@EqualsAndHashCode(callSuper=false)
public abstract class Shop9Message {
	private boolean sucesso;
	private String mensagem;
	private String tipo;
	private String complementoTipo;
	private int statusCode;
}
