package br.lasalle.oop.trab1;

public class Cachorro {
//Atributos da classe
	String nome;
	String ra�a;
	String sexo;
	Boolean doente;
	
	protected void Cavar() {
		System.out.print((!doente)? "\nO cachorro n�o pode cavar porque est� doente":"\nO cachorro come�ou a cavar um buraco");
		return;
	}
}
