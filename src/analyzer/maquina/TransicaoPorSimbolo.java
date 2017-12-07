package analyzer.maquina;


public class TransicaoPorSimbolo extends AbstractTransicao {
	private String simbolo;
	
	public TransicaoPorSimbolo(Estado proximo, String simbolo, boolean criaToken) {
		super(proximo, criaToken);
		this.simbolo = simbolo;
	}

	@Override
	public Estado transitar(Fita fita, String espaco) {
		String consumido = fita.getConsumido();
		System.out.println(espaco+"[TRANSICAO POR SIMBOLO] ultimo simbolo consumido:"+consumido);
		System.out.println(espaco+"[TRANSICAO POR SIMBOLO] simbolo da transi��o: "+simbolo);
		int posicaoCabeca = fita.getPosicaoCabeca();
		if(simbolo.equals(consumido)) {
			System.out.println(espaco+"[TRANSICAO POR SIMBOLO] validado: "+simbolo+"="+consumido);
			return proximo;
		} else {
			System.out.println(espaco+"[TRANSICAO POR SIMBOLO] nao validado: "+simbolo+"="+consumido);
			fita.setPosicaoCabeca(posicaoCabeca);
			return null;
		}
	}
}
