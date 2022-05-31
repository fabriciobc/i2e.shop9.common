package br.com.i2e.shop9.model;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter( autoApply = true )
public class TipoEmalConverter implements AttributeConverter<Contato.TipoEmail, Character> {

	@Override
	public Character convertToDatabaseColumn( Contato.TipoEmail tipoEmail ) {
		if ( tipoEmail == null ) {
			return null;
		}
		return tipoEmail.getCodigo();
	}

	@Override
	public Contato.TipoEmail convertToEntityAttribute( Character codigo ) {
		return Contato.TipoEmail.of( codigo );
	}
}
