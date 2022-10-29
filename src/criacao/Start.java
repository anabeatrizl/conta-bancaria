package criacao;

import java.math.BigDecimal;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		Conta conta = new Conta();

		System.out.println("Informe o seu nome completo: ");
		conta.setNome(input.nextLine());

		System.out.println("\nInforme o seu RG completo: ");
		conta.setRg(input.nextLine());

		System.out.println("\nInforme o seu CPF completo: ");
		conta.setCpf(input.nextLine());

		System.out.println("\nInforme o seu telefone completo: ");
		conta.setTelefone(input.nextLine());

		System.out.println("\nInforme quanto deseja depositar: ");
		conta.setSaldo(input.nextBigDecimal());

		System.out.println("\nConta criada com sucesso! O que deseja fazer agora?");

		int opcao = 1;

		while (opcao != 0) {

			System.out.println("\n1: Ver meus dados");
			System.out.println("2: Ver meu saldo atual");
			System.out.println("3: Sacar");
			System.out.println("4: Depositar");

			opcao = input.nextInt();

			switch (opcao) {

			case 1:

				listar(conta);
				break;

			case 2:

				System.out.println(verSaldo(conta));
				break;

			case 3:

				System.out.println("Informe quanto deseja sacar: ");
				sacar(conta,input.nextBigDecimal());
				
				System.out.println("Saque realizado com sucesso." + verSaldo(conta));
				break;

			case 4:

				System.out.println("Informe quanto deseja depositar: ");
				depositar(conta,input.nextBigDecimal());

				System.out.println("Saque realizado com sucesso." + verSaldo(conta));
				break;

			}

			System.out.println("\nDigite OK para voltar as opcoes.");
			input.next();

		}
	}

	private static void listar(Conta conta) {

		System.out.println("Abaixo, seguem os dados da sua conta: ");
		System.out.println("\nNome: " + conta.getNome());
		System.out.println("RG: " + conta.getRg());
		System.out.println("CPF: " + conta.getCpf());
		System.out.println("Telefone: " + conta.getTelefone());

	}
	
	private static String verSaldo(Conta conta) {

		return "O seu saldo atual e: " + conta.getSaldo();

	}

	private static void sacar(Conta conta, BigDecimal valorSaque) {

		conta.setSaldo(conta.getSaldo().subtract(valorSaque));
		
	}
	
	private static void depositar(Conta conta, BigDecimal valorDeposito) {
		
		conta.setSaldo(conta.getSaldo().add(valorDeposito));
		
	}
	
}
