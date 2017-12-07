package analyzer.maquina;

public class TransicaoPorMaquina extends AbstractTransicao {
	private Maquina maquina;
	
	public TransicaoPorMaquina(Estado proximo, Maquina maquina, boolean criaToken) {
		super(proximo, criaToken);
		this.maquina = maquina;
	}

	@Override
	public Estado transitar(Fita fita, String espaco) {
		boolean aceita = maquina.aceita(fita, espaco+"\t");
		if(aceita) {
			return proximo;
		} else {
			return null;
		}
	}
}
