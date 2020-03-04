package br.lasalle.oop.trab1;

public class Cachorro {
//Atributos da classe
	String nome;
	String raça;
	String sexo;
	Boolean doente;
	
	protected void Cavar() {
		System.out.print((!doente)? "\nO cachorro não pode cavar porque está doente":"\nO cachorro começou a cavar um buraco");
		return;
	}
}
