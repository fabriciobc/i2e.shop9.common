package br.com.i2e.shop9.model;

import java.util.List;
import lombok.Data;


@Data
public class FotosProduto {
	private String codigo;
	private List<PosicaoFotos> fotos;
}