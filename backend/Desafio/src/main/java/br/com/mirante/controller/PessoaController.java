package br.com.mirante.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.mirante.dao.PessoaDao;
import br.com.mirante.entity.Pessoa;

public class PessoaController {

	@Inject
	private PessoaDao dao;
	
	
	
	public List<Pessoa> findAll() {
		return dao.findAll();
	}

	public void save(Pessoa pessoa) {
		dao.save(pessoa);
	}

	public void update(Long id, Pessoa pessoa) {
		dao.update(adicionaDadosParaAtualizar(id, pessoa));
	}

	public void delete(Long id) {
		Pessoa pessoa = findById(id);
		dao.delete(pessoa);
	}
	
	public Pessoa findById(Long id) {
		return dao.findById(id);
	}
	
	
	private Pessoa adicionaDadosParaAtualizar(Long id, Pessoa pessoa) {
		Pessoa pess = findById(id);
		if(pess != null) {
			pess.setIdPessoa(id);
			
			if(pessoa.getNome() != null)
				pess.setNome(pessoa.getNome());
			
			if(pessoa.getNomeMae() != null)
				pess.setNomeMae(pessoa.getNomeMae());
			
			if(pessoa.getNomePai() != null)
				pess.setNomePai(pessoa.getNomePai());
			
			if(pessoa.getDocumento() != null)
				pess.setDocumento(pessoa.getDocumento());
			
			if(pessoa.getDtNascimento() != null)
				pess.setDtNascimento(pessoa.getDtNascimento());
			
			if(pessoa.getDtNascimento() != null)
				pess.setDtNascimento(pessoa.getDtNascimento());
			
			
			return pess;
		}
		return pessoa;
	}

}
