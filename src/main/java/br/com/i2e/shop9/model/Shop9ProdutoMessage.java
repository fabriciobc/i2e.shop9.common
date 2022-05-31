package br.com.i2e.shop9.model;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data@EqualsAndHashCode(callSuper=false)
public class Shop9ProdutoMessage extends Shop9Message {
	
	private List<ProdutoS9> dados;
}
