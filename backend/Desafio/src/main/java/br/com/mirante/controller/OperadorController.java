package br.com.mirante.controller;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.mirante.dao.OperadorDao;
import br.com.mirante.entity.Operador;

@Stateless
public class OperadorController {

	@Inject
	private OperadorDao dao;
	
	public Operador store(Operador operador) {
		dao.salvar(operador);
		return operador;
	}
	
	public void delete(Long id) {
		Operador operador = findById(id);
		dao.excluir(operador);
	}
	
	public Operador findById(Long id) {
		return dao.findById(id);
	}
	
	public Operador update(Long id, Operador operador) {
		dao.atualizar(adicionaDadosParaAtualizar(id, operador));
		return operador;
	}
	
	public List<Operador> listar() {
		return dao.listar();
	}
	
	private Operador adicionaDadosParaAtualizar(Long id, Operador operador) {
		Operador ope = findById(id);
		if(ope != null) {
			ope.setIdOperador(id);
			if(operador.getNome() != null)
				ope.setNome(operador.getNome());
			if(operador.getSenha() != null)
				ope.setSenha(operador.getSenha());
			if(operador.getLogin() != null)
				ope.setLogin(operador.getLogin());
			if(operador.getPerfil() != null)
				ope.setPerfil(operador.getPerfil());
			return ope;
		}
		return operador;
	}
	
}
