package br.com.sicoob.sisbr.cca.movimentacao.vo;

import java.math.BigDecimal;

import br.com.bancoob.negocio.vo.BancoobVo;

/**
 * A Classe ConsultaDebitoIndeterminadoVO
 *
 * @author marco.nascimento
 */
public class ConsultaDebitoIndeterminadoRenVO extends BancoobVo {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6525314160188685784L;
	
	private Integer idContaCapital;
	private Integer idDebitoContaCapital;
	private Integer numContaCapital;
	private String nome;
	private String tipoPessoa;
	private String formaDebito;
	private BigDecimal valor;
	private String dataPeriodoDeb;
	private Integer idTipoValorDebito;
	private Integer idTipoIntegralizacao;
	private String numMatriculaFunc;
	private String nomeEmpresa;
	
	/**
	 * Filtro
	 */
	private String cpfCnpj;
	private Boolean selecionado;
	private Integer diaDebito;
	private Integer idTipoPessoa;
	private Integer idFormaDebito;
	private Long numContaCorrente;
	
	/**
	 * @return the idContaCapital
	 */
	public Integer getIdContaCapital() {
		return idContaCapital;
	}
	/**
	 * @param idContaCapital the idContaCapital to set
	 */
	public void setIdContaCapital(Integer idContaCapital) {
		this.idContaCapital = idContaCapital;
	}
	/**
	 * @return the idDebitoContaCapital
	 */
	public Integer getIdDebitoContaCapital() {
		return idDebitoContaCapital;
	}
	/**
	 * @param idDebitoContaCapital the idDebitoContaCapital to set
	 */
	public void setIdDebitoContaCapital(Integer idDebitoContaCapital) {
		this.idDebitoContaCapital = idDebitoContaCapital;
	}
	/**
	 * @return the numContaCapital
	 */
	public Integer getNumContaCapital() {
		return numContaCapital;
	}
	/**
	 * @param numContaCapital the numContaCapital to set
	 */
	public void setNumContaCapital(Integer numContaCapital) {
		this.numContaCapital = numContaCapital;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the tipoPessoa
	 */
	public String getTipoPessoa() {
		return tipoPessoa;
	}
	/**
	 * @param tipoPessoa the tipoPessoa to set
	 */
	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	/**
	 * @return the formaDebito
	 */
	public String getFormaDebito() {
		return formaDebito;
	}
	/**
	 * @param formaDebito the formaDebito to set
	 */
	public void setFormaDebito(String formaDebito) {
		this.formaDebito = formaDebito;
	}
	/**
	 * @return the valor
	 */
	public BigDecimal getValor() {
		return valor;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	/**
	 * @return the dataPeriodoDeb
	 */
	public String getDataPeriodoDeb() {
		return dataPeriodoDeb;
	}
	/**
	 * @param dataPeriodoDeb the dataPeriodoDeb to set
	 */
	public void setDataPeriodoDeb(String dataPeriodoDeb) {
		this.dataPeriodoDeb = dataPeriodoDeb;
	}
	/**
	 * @return the idTipoValorDebito
	 */
	public Integer getIdTipoValorDebito() {
		return idTipoValorDebito;
	}
	/**
	 * @param idTipoValorDebito the idTipoValorDebito to set
	 */
	public void setIdTipoValorDebito(Integer idTipoValorDebito) {
		this.idTipoValorDebito = idTipoValorDebito;
	}
	/**
	 * @return the cpfCnpj
	 */
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	/**
	 * @param cpfCnpj the cpfCnpj to set
	 */
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	/**
	 * @return the selecionado
	 */
	public Boolean getSelecionado() {
		return selecionado;
	}
	/**
	 * @param selecionado the selecionado to set
	 */
	public void setSelecionado(Boolean selecionado) {
		this.selecionado = selecionado;
	}
	/**
	 * @return the diaDebito
	 */
	public Integer getDiaDebito() {
		return diaDebito;
	}
	/**
	 * @param diaDebito the diaDebito to set
	 */
	public void setDiaDebito(Integer diaDebito) {
		this.diaDebito = diaDebito;
	}
	/**
	 * @return the idTipoPessoa
	 */
	public Integer getIdTipoPessoa() {
		return idTipoPessoa;
	}
	/**
	 * @param idTipoPessoa the idTipoPessoa to set
	 */
	public void setIdTipoPessoa(Integer idTipoPessoa) {
		this.idTipoPessoa = idTipoPessoa;
	}
	/**
	 * @return the idFormaDebito
	 */
	public Integer getIdFormaDebito() {
		return idFormaDebito;
	}
	/**
	 * @param idFormaDebito the idFormaDebito to set
	 */
	public void setIdFormaDebito(Integer idFormaDebito) {
		this.idFormaDebito = idFormaDebito;
	}
	/**
	 * @return the numContaCorrente
	 */
	public Long getNumContaCorrente() {
		return numContaCorrente;
	}
	/**
	 * @param numContaCorrente the numContaCorrente to set
	 */
	public void setNumContaCorrente(Long numContaCorrente) {
		this.numContaCorrente = numContaCorrente;
	}
	/**
	 * @return the numMatriculaFunc
	 */
	public String getNumMatriculaFunc() {
		return numMatriculaFunc;
	}
	/**
	 * @param numMatriculaFunc the numMatriculaFunc to set
	 */
	public void setNumMatriculaFunc(String numMatriculaFunc) {
		this.numMatriculaFunc = numMatriculaFunc;
	}
	/**
	 * @return the nomeEmpresa
	 */
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	/**
	 * @param nomeEmpresa the nomeEmpresa to set
	 */
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	/**
	 * @return the idTipoIntegralizacao
	 */
	public Integer getIdTipoIntegralizacao() {
		return idTipoIntegralizacao;
	}
	/**
	 * @param idTipoIntegralizacao the idTipoIntegralizacao to set
	 */
	public void setIdTipoIntegralizacao(Integer idTipoIntegralizacao) {
		this.idTipoIntegralizacao = idTipoIntegralizacao;
	}
}