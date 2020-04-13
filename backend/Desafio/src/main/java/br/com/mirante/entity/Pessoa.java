package br.com.mirante.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Fetch;

import br.com.mirante.enuns.TipoPessoa;

@Entity
@Table(name = "TB_PESSOA")
public class Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pessoa")
	private Long idPessoa;

	@NotBlank
	@Column(name = "nome")
	private String nome;
	
	@NotBlank
	@Column(name = "nome_pai")
	private String nomePai;
	
	@NotBlank
	@Column(name = "nome_mae")
	private String nomeMae;
	
	@NotBlank
	@Column(name = "documento")
	private String documento;
	
	@NotBlank
	@Column(name = "login_operador")
	private String loginOperador;

	@NotNull
	@Enumerated
	private TipoPessoa tpPessoa;
	
	@NotBlank
	@Column(name = "dt_nascimento")
	private String dtNascimento;
	
	@NotNull
	@Column(name = "dt_cadastro")
	private LocalDateTime dtCadastro = LocalDateTime.now();

	@OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "ID_PESSOA")  
	@Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
	private List<Telefone> telefoneList = new ArrayList<>();
	
	
	/*Get's and Set's*/
	
	public Long getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Long idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getLoginOperador() {
		return loginOperador;
	}
	public void setLoginOperador(String loginOperador) {
		this.loginOperador = loginOperador;
	}
	public TipoPessoa getTpPessoa() {
		return tpPessoa;
	}
	public void setTpPessoa(TipoPessoa tpPessoa) {
		this.tpPessoa = tpPessoa;
	}

	public String getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public List<Telefone> getTelefoneList() {
		return telefoneList;
	}
	public void setTelefoneList(List<Telefone> telefoneList) {
		this.telefoneList = telefoneList;
	}
	public LocalDateTime getDtCadastro() {
		return dtCadastro;
	}
	public void setDtCadastro(LocalDateTime dtCadastro) {
		this.dtCadastro = dtCadastro;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPessoa == null) ? 0 : idPessoa.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (idPessoa == null) {
			if (other.idPessoa != null)
				return false;
		} else if (!idPessoa.equals(other.idPessoa))
			return false;
		return true;
	}
	
}
