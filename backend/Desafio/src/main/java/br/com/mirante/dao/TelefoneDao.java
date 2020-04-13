package br.com.mirante.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.mirante.entity.Telefone;

@Stateless
public class TelefoneDao {

	@PersistenceContext
	private EntityManager entityManager;

	public void salvar(Telefone telefone) {
		entityManager.persist(telefone);
	}
	
	public void atualizar(Telefone telefone) {
		entityManager.merge(telefone);
	}
	
	public void excluir(Telefone telefone) {
		entityManager.remove(telefone);
	}
	
	public Telefone findById(Long identificador){
		Query query = entityManager.createQuery(
						"SELECT telefone FROM Telefone telefone WHERE telefone.idTelefone =:identificador",
						Telefone.class);	
		query.setParameter("identificador", identificador);
		return (Telefone) query.getSingleResult();
	}
	
	public List<Telefone> listar(){
		return entityManager
				.createQuery("SELECT telefone FROM Telefone telefone", Telefone.class)
				.getResultList();
	}
}
