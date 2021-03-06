package model.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

import model.entities.Cliente;
import model.entities.Corretor;

public class ClienteList {
	private List<Cliente> clienteList;
	
	public ClienteList(){
		clienteList= new ArrayList<>() ;
	}
	
	public void addCliente(Cliente c) {
		clienteList.add(c);
	}
	
	public boolean removeCliente(Cliente c) {
		return clienteList.remove(c);
	}
	
	public Cliente getCliente(int index) {
		return clienteList.get(index);
	}
	
	public void removeCliente(int index) {
		clienteList.remove(index);
	}
	
	public boolean hasElement(Cliente c) {
		return clienteList.contains(c);
	}
	
	public boolean estaVazia() {
		return clienteList.isEmpty();
	}
	
	public String[] transformaEmArrayDeNomes() {
		String result = "";
		for (Cliente cliente: clienteList) {
			result = result + cliente.getNome() + " ";		
		}
		String[] nomeClientes = result.split(" ");
		return  nomeClientes;  // Como ele separa os nomes por \n, penseieu usar esse split pra criar a array.
	}

	public String toStringOfObject(Object c) {
		String find = "";
		for (int i = 0; i < clienteList.size(); i++) {
			if (this.getCliente(i).getNome().equals(c)) {
				find = this.getCliente(i).toString();
			}
		}
		return find;
	}
	
	public Cliente findCliente (Object cliente) {
		Cliente find = new Cliente();
		for (int i = 0; i < clienteList.size(); i++) {
			if (this.getCliente(i).getNome().equals(cliente.toString())) {
				find = this.getCliente(i);
			}
		}
		return find;
	}
	
	public String toString() {
		String result = "";
		for (Cliente cliente: clienteList) {
			result = result + cliente + "\n";
		}
		return result;
	}
}