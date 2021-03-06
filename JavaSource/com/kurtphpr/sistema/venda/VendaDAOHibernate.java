package com.kurtphpr.sistema.venda;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class VendaDAOHibernate implements VendaDAO{

	//Atributo
	private Session sessao;

	public Session getSessao() {
		return sessao;
	}

	public void setSessao(Session sessao) {
		this.sessao = sessao;
	}

	@Override
	public void registra(Venda venda) {
		
		this.sessao.save(venda);
	}	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Venda> getLista() {

		Criteria lista = sessao.createCriteria(Venda.class); //Objeto Criteria irá retorna uma lista de produtos do banco;
		return lista.list();
	}

	@Override
	public void excluir(Venda venda) {
		
		this.sessao.delete(venda);
	}
}
