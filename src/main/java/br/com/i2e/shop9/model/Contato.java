package br.com.i2e.shop9.model;

import java.util.stream.Stream;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.Data;

@Data
public class Contato {
	public enum TipoEmail {
		EMPRESA('E'), PESSOAL('P'), FINANCEIRO('F'), NFE('N'), MALA_DIRETA('M'),
		NAO_DEFINIDO('C');
		Character codigo;
		
		private TipoEmail( Character codigo ) {
			this.codigo = codigo;
		}
		@JsonValue
		public Character getCodigo() {
			return codigo;
		}
		@JsonCreator
		public static TipoEmail of( Character codigo ) {
			if ( codigo == null ) {
				return null;
			}

			return Stream.of( values() )
					.filter( c -> c.getCodigo().equals( codigo ) )
					.findFirst()
					.orElseThrow( IllegalArgumentException::new );
		}
	}
	
	private String nome;
	/* M ou F */
	@Pattern( regexp = "^[M,F]" )
	private Character sexo; 
	private String cargo;
	Integer diaAniversario;
	// TODO Regexp (JAN até DEZ)
	String mesAniversario; 
	Integer anoAniversario;
	private String telefone;
	private String ramal;
	private TipoEmail tipoEmail; 
	private String email;
}
