package com.kurtphpr.sistema.cliente;

import com.kurtphpr.sistema.util.DAOFactory;

public class ClienteRN {

	private ClienteDAO clienteDAO;
	
	public ClienteRN(){
		this.clienteDAO = DAOFactory.criaClienteDAO();
	}

	public void salvar(Cliente clienteC1) {
		
		this.clienteDAO.salvar(clienteC1);
	}
}