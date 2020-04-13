package br.com.mirante.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.mirante.entity.Operador;

@Stateless
public class OperadorDao {

	@PersistenceContext
	private EntityManager entityManager;

	public void salvar(Operador operador) {
		entityManager.persist(operador);
	}
	
	public void atualizar(Operador operador) {
		entityManager.merge(operador);
	}
	
	public void excluir(Operador operador) {
		entityManager.remove(operador);
	}
	
	public Operador findById(Long identificador){
		Query query = entityManager.createQuery(
						"SELECT operador FROM Operador operador WHERE operador.idOperador =:identificador",
						Operador.class);	
		query.setParameter("identificador", identificador);
		return (Operador) query.getSingleResult();
	}
	
	public List<Operador> listar(){
		return entityManager
				.createQuery("SELECT operador FROM Operador operador", Operador.class)
				.getResultList();
	}
}
