package br.com.mirante.enuns;

public enum Perfil {
	GERENTE("Gerente"),
	ANALISTA("Analista");
	
	private String descricao;
	
	private Perfil(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
}
