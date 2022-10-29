package criacao;

import java.math.BigDecimal;
import java.util.Scanner;

public class Conta {

	private static String nome;
	private static String rg;
	private static String cpf;
	private static String telefone;
	private static BigDecimal saldo;
	
	public static String getNome() {
		return nome;
	}
	public static void setNome(String nome) {
		Conta.nome = nome;
	}
	public static String getRg() {
		return rg;
	}
	public static void setRg(String rg) {
		Conta.rg = rg;
	}
	public static String getCpf() {
		return cpf;
	}
	public static void setCpf(String cpf) {
		Conta.cpf = cpf;
	}
	public static String getTelefone() {
		return telefone;
	}
	public static void setTelefone(String telefone) {
		Conta.telefone = telefone;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public static void setSaldo (BigDecimal saldo) {
		Conta.saldo = saldo;
	}
	
}
