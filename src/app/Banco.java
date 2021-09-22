package app;

import model.Conta;

public class Banco {

	public static void main(String[] args) {

		Conta contaDaMaria = new Conta();
		contaDaMaria.titular = "Maria Lurdes";
		contaDaMaria.agencia = "5521-7";
		contaDaMaria.numero = "7845-5";
		contaDaMaria.tipoConta = "Corrente";
		contaDaMaria.saldo = 1000;
	
		Conta contaDoPedro = new Conta();
	    contaDoPedro.titular = "Pedro Cabral";
	    contaDoPedro.agencia = "5521-7";
	    contaDoPedro.numero = "8945-5";
	    contaDoPedro.tipoConta = "Poupança";
	    contaDoPedro.saldo = 500;
	    
	    //ver saudo da Maria
	    System.out.println(contaDaMaria.saldo);
	    
	    System.out.println(contaDoPedro.saldo);
	
	    //Depositar 100 reais na conta da Maria 
	    contaDaMaria.depositar(100);
	System.out.println("Valor Deposito");
	System.out.println(contaDaMaria);
	
	}

}
