package br.lasalle.oop.trab1;

public class TrabalhoTester {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Gabriel";
		pessoa1.email = "aa@aa";
		pessoa1.celular = "(11) 11111.1111";
		pessoa1.vivo = true;
		pessoa1.comprar();
				
		Cachorro cachorro1 = new Cachorro();
		cachorro1.nome = "doguinho";
		cachorro1.raça = "labrador";
		cachorro1.sexo = "Macho";
		cachorro1.doente = false;
		cachorro1.Cavar();
	}

}
