package com.kurtphpr.sistema.cliente;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

public class ClienteDAOHibernate implements ClienteDAO {

	private Session sessao;
	
	@Override
	public void salvar(Cliente cliente) {
		
		this.sessao.save(cliente);
	}

	public Session getSessao() {
		return sessao;
	}

	public void setSessao(Session sessao) {
		this.sessao = sessao;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> listar() {
		
		Criteria lista = sessao.createCriteria(Cliente.class); //Objeto Criteria irá retorna uma lista de produtos do banco;
		return lista.list();
	}

	@Override
	public void excluir(Cliente cliente) {
		
		this.sessao.delete(cliente);
	}

	@Override
	public Cliente pesquisar(String string) {
		
		Query consultaNome = this.sessao.createQuery("from Cliente c1 where c1.nome like :nome ");
		consultaNome.setString("nome", "%"+string+"%");
		
		return (Cliente) consultaNome.uniqueResult();
	}

	@Override
	public void alterar(Cliente cliente) {
		
		this.sessao.update(cliente);
	}
}
