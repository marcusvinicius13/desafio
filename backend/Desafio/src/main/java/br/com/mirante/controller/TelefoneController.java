package br.com.mirante.controller;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.mirante.dao.TelefoneDao;
import br.com.mirante.entity.Telefone;

@Stateless
public class TelefoneController {

	@Inject
	private TelefoneDao dao;
	
	public Telefone store(Telefone telefone) {
		dao.salvar(telefone);
		return telefone;
	}
	
	public void delete(Long id) {
		Telefone telefone = findById(id);
		dao.excluir(telefone);
	}
	
	public Telefone findById(Long id) {
		return dao.findById(id);
	}
	
	public Telefone update(Long id, Telefone telefone) {
		dao.atualizar(adicionaDadosParaAtualizar(id, telefone));
		return telefone;
	}
	
	public List<Telefone> listar() {
		return dao.listar();
	}
	
	private Telefone adicionaDadosParaAtualizar(Long id, Telefone telefone) {
		Telefone tel = findById(id);
		if(tel != null) {
			tel.setIdTelefone(id);
			
			if(telefone.getDdd() != null)
				tel.setDdd(telefone.getDdd());
			
			if(telefone.getNumero() != null)
				tel.setNumero(telefone.getNumero());
			
			if(telefone.getTipo() != null)
				tel.setTipo(telefone.getTipo());
			
			return tel;
		}
		return telefone;
	}

}
