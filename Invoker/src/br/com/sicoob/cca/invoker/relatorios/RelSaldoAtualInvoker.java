package br.com.sicoob.cca.invoker.relatorios;

import java.io.IOException;

import br.com.sicoob.relatorio.api.dto.ParametroDTO;
import net.sf.jasperreports.engine.JRException;

/**
 * The Class RelParcelamentoContaCapitalInvoker.
 */
public class RelSaldoAtualInvoker extends ContaCapitalJasperReportInvoker {

	/** The Constant LOOKUP_NAME. */
	private static final String LOOKUP_NAME = "cca_relatorios/RelSaldoAtualServicoRemote";

	/** The Constant PARAM_ID_INSTITUICAO. */
	private static final int PARAM_ID_INSTITUICAO = 29;

	/** The Constant PARAM_ID_CCA_INICIAL. */
	private static final int PARAM_ID_CCA_INICIAL = 1;

	/** The Constant PARAM_ID_CCA_FINAL. */
	private static final int PARAM_ID_CCA_FINAL = 1200;

	/** The Constant PARAM_ID_SITUACAO_CONTA. */
	private static final int PARAM_ID_SITUACAO_CONTA = -1;

	/** The Constant PARAM_CADASTROS_APROVADOS. */
	private static final boolean PARAM_CADASTROS_APROVADOS = false;

	/** The Constant PARAM_FILTRO_ORDENACAO. */
	private static final int PARAM_FILTRO_ORDENACAO = 1;

	/** The Constant PARAM_SITUACAO_PARCELA. */
	private static final int PARAM_SITUACAO_PARCELA = -1;

	/** The Constant PARAM_AGRUPADOR_PA. */
	private static final boolean PARAM_AGRUPADOR_PA = false;

	private static final String CNPJ = "01234567890000";

	private static final String DESC_EMPRESA = "PHD - Comercio de Veiculos do Dantas";

	
	/* (non-Javadoc)
	 * @see br.com.sicoob.cca.invoker.relatorios.ContaCapitalJasperReportInvoker#criarParametros()
	 */
	@Override
	protected ParametroDTO criarParametros() {
		ParametroDTO dto = new ParametroDTO();
		dto.getDados().put("filtroIdInstituicao", PARAM_ID_INSTITUICAO);
		dto.getDados().put("filtroNumContaCapitalInicial", PARAM_ID_CCA_INICIAL);
		dto.getDados().put("filtroNumContaCapitalFinal", PARAM_ID_CCA_FINAL);
		dto.getDados().put("filtroIdSituacaoConta", PARAM_ID_SITUACAO_CONTA);
		dto.getDados().put("filtroCadastrosAprovados", PARAM_CADASTROS_APROVADOS);
		dto.getDados().put("filtroNumPA", PARAM_SITUACAO_PARCELA);
		dto.getDados().put("filtroOrdenacao", PARAM_FILTRO_ORDENACAO);
		dto.getDados().put("filtroAgruparPorPA", PARAM_AGRUPADOR_PA);
		dto.getDados().put("filtroCnpjEmpresa", CNPJ);
		dto.getDados().put("filtroDescEmpresa", DESC_EMPRESA);
		dto.getDados().put("filtroNumPessoaJuridica", null);
		return dto;
	}

	/**
	 * main.
	 *
	 * @param args the arguments
	 * @throws JRException the JR exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws JRException, IOException {
		new RelSaldoAtualInvoker().invoke(LOOKUP_NAME);
	}
}