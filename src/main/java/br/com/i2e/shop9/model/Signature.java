package br.com.i2e.shop9.model;

import lombok.Data;

@Data
public class Signature {
	public Signature() {
		setTimestamp( String.valueOf( System.currentTimeMillis() / 1000 ) );
	}
	private String token;
	private String timestamp;
}
