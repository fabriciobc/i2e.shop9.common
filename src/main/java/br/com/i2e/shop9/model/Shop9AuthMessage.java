package br.com.i2e.shop9.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data@EqualsAndHashCode(callSuper=false)
public class Shop9AuthMessage extends Shop9Message {
	private AuthenticationToken dados;
}
