package br.com.i2e.shop9.model;

import java.util.List;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ClienteS9 {
	private Long codigo;
	private String nome;
	private String fantasia;
	@Pattern( regexp = "[C,F,R]" )
	private Character tipo;
	@Pattern( regexp = "[F,J]" )
	private Character fisicaJuridica;
	// TODO converter em enum
	// 1, 2 ou 9 (Contribuinte, Isento ou Não contribuinte) 
	@Pattern( regexp = "[1,2,9]" )
	private Integer indicadorIE;
	@Size( min = 14, max = 14 )
	private String cpfCnpj;
	private String rg;
	private String ie;
	@Size( min = 8, max = 8 )
	private String cep;
	private String endereco;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	@Size( min = 2, max = 2 )
	private String uf;
	private String pais;
	private String telefone1;
	private String telefone2;
	private String fax;
	private String entregaCep;
	private String entregaEndereco;
	private String entregaNumero;
	private String entregaComplemento;
	private String entregaBairro;
	private String entregaCidade;
	private String entregaUf;
	private String entregaPais;
	private String entregaPontoRef1;
	private String entregaPontoRef2;
	private String faturamentoCep;
	private String faturamentoEndereco;
	private String faturamentoNumero;
	private String faturamentoComplemento;
	private String faturamentoBairro;
	private String faturamentoCidade;
	private String faturamentoUf;
	private String faturamentoPais;
	private String faturamentoPontoRef1;
	private String faturamentoPontoRef2;
	private String urlContatos;
	private List<Contato> contatos;
}