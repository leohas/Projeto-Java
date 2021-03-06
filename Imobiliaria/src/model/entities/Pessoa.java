package model.entities;

import model.exceptions.CpfInvalidoException;
import model.exceptions.ValorInvalidoException;

public abstract class Pessoa  {
	protected String nome;

	protected long telefone;

	protected long cpf;
	
	public Pessoa() {
	}
	

	public Pessoa(String nome, long telefoneCliente, long cpfCliente)throws ValorInvalidoException, CpfInvalidoException {
		try{
			this.nome = nome;
			this.cpf = cpfCliente;
			this.telefone = telefoneCliente;
		} catch(Exception e) {
			System.err.println("Digite um valor correto");
		}
	}
	
	public String getNome() {
		  return nome;
		 }

		 public void setNome(String nome) {
		  this.nome = nome;
		 }

		 public long getTelefone() {
		  return telefone;
		 }

		 public void setTelefone(int telefone) {
		  this.telefone = telefone;
		 }

		 public long getCpf() {
		  return cpf;
		 }

		 public void setCpf(long cpf) {
		  this.cpf = cpf;
		 }
	public String toString() {
		return "Nome: " + this.nome + "\nCPF: " + this.cpf;
	}
}
