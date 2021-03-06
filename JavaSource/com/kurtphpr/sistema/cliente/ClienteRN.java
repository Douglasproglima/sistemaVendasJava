package com.kurtphpr.sistema.cliente;

import java.util.List;

import com.kurtphpr.sistema.util.DAOFactory;

public class ClienteRN {

	private ClienteDAO clienteDAO;
	
	public ClienteRN(){
		
		this.clienteDAO = DAOFactory.criaClienteDAO();
	}

	public void salvar(Cliente clienteC1) {
		
		this.clienteDAO.salvar(clienteC1);
	}

	public List<Cliente> listar() {
		
		return this.clienteDAO.listar();
	}

	public void excluir(Cliente cliente) {
		
		this.clienteDAO.excluir(cliente);
	}

	public Cliente pesquisar(String string) {
		
		return this.clienteDAO.pesquisar(string);
	}

	public void alterar(Cliente cliente) {
		
		this.clienteDAO.alterar(cliente);
	}
}
