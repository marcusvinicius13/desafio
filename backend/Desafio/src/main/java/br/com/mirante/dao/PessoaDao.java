package br.com.mirante.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.mirante.entity.Pessoa;

@Stateless
public class PessoaDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void save(Pessoa pessoa) {
		entityManager.persist(pessoa);
	}
	
	public void update(Pessoa pessoa) {
		entityManager.merge(pessoa);
	}
	
	public void delete(Pessoa pessoa) {
		Pessoa pessoaMerge = entityManager.merge(pessoa);
		entityManager.remove(pessoaMerge);
	}
	
	
	public Pessoa findById(Long identificador) {
		Query query = entityManager.createQuery(
				"SELECT pessoa FROM Pessoa pessoa WHERE pessoa.idPessoa =:identificador",
				Pessoa.class);	
		query.setParameter("identificador", identificador);
		return (Pessoa) query.getSingleResult();
	}
	
	public List<Pessoa> findAll(){
		return entityManager
				.createQuery("SELECT pessoa FROM Pessoa pessoa", Pessoa.class)
				.getResultList();
	}
}
