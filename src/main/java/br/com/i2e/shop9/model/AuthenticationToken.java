package br.com.i2e.shop9.model;

import java.time.ZonedDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class AuthenticationToken {

	private String token;
	@JsonFormat( pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSSXXX" )
	private ZonedDateTime expireAt;

}
