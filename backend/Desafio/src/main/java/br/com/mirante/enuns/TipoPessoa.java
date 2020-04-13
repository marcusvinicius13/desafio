package br.com.mirante.enuns;

public enum TipoPessoa {
	
	FISICA("F�sica"), JURIDICA("Jur�dica");
	
	private String descricao;
	
	private TipoPessoa(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
}
