package br.lasalle.oop.trab1;

public class Pessoa {
// Atributos da classe
	String nome;
	String celular;
	String email;
	Boolean vivo;
	
	protected void comprar () {
		System.out.print((!vivo)? "A pessoa precisa estar viva para comprar":"A pessoa comprou alguma coisa");
		return;
	}
	
}
