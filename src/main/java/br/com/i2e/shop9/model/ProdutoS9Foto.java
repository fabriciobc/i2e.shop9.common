package br.com.i2e.shop9.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@NoArgsConstructor@AllArgsConstructor
public class ProdutoS9Foto {
	
	private byte[] foto;
	private int posicao;
	private boolean principal;
}