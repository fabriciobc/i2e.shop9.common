package br.com.i2e.shop9.model;

import lombok.Data;

@Data
public class EnderecoEntrega {
	private String cep;
	private String endereco;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String uf;
}
