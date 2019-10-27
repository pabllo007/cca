/*
 * 
 */
package br.com.sicoob.cca.entidades.negocio.entidades;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Tipo Pessoa
 * 0 - Pessoas f�sica
 * 1 - Pessoa jur�dica
 * 2 - Ambos
 * @author marco.nascimento
 * @since 15/05/2014
 */
@Entity
@Table(name = "TIPOPESSOA", schema = "cca")
public class TipoPessoa extends ContaCapitalEntidade<Short> {

	/**
	 * Identificador do tipo de pessoa. 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDTIPOPESSOA")
	private Short id;
	
	/**
	 * Descri��o do tipo de pessoa
	 */
	@Column(name = "DESCTIPOPESSOA", length = 30, nullable = false)
	private String descricao;

	/**
	 * @return the id
	 */
	public Short getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Short id) {
		this.id = id;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}