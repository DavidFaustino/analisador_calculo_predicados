package analyzer.test;


import analyzer.maquina.Estado;
import analyzer.maquina.Maquina;
import analyzer.maquina.TransicaoPorMaquina;
import analyzer.maquina.TransicaoPorSimbolo;
import analyzer.servico.Framework;
import org.junit.Before;



public class Init {
	
	Maquina Alfa_ao;
	Maquina Alfa_az;
	Maquina Alfa_pz;
	Maquina AlfaAO;
	Maquina AlfaAz;
	Maquina AlfaNumerico;
	Maquina AlfaNumericoFRT;
	Maquina AlfaPZ;
	Maquina AlfaUnder;
	Maquina Connective;
	Maquina Constante;
	Maquina Digito;
	Maquina Funcao;
	Maquina NTermo;
	Maquina Predicado;
	Maquina Qualificador;
	Maquina SentencaAtomica;
	Maquina Termo;
	Maquina Variavel;
	
	@Before
	public void criaMaquina() {
		Framework frame = Framework.getInstance();
		Alfa_ao = frame.criaMaquina("Alfa_ao");
		Alfa_az = frame.criaMaquina("Alfa_az");
		Alfa_pz = frame.criaMaquina("Alfa_pz");
		AlfaAO = frame.criaMaquina("AlfaAO");
		AlfaAz = frame.criaMaquina("AlfaAz");
		AlfaNumerico = frame.criaMaquina("AlfaNumerico");
		AlfaNumericoFRT = frame.criaMaquina("AlfaNumericoFRT");
		AlfaPZ = frame.criaMaquina("AlfaPZ");
		AlfaUnder = frame.criaMaquina("AlfaUnder");
		Connective = frame.criaMaquina("Connective");
		Constante = frame.criaMaquina("Constante");
		Digito = frame.criaMaquina("Digito");
		Funcao = frame.criaMaquina("Funcao");
		NTermo = frame.criaMaquina("NTermo");
		Predicado = frame.criaMaquina("Predicado");
		Qualificador = frame.criaMaquina("Qualificador");
		SentencaAtomica = frame.criaMaquina("SentencaAtomica");
		Termo = frame.criaMaquina("Termo");
		Variavel = frame.criaMaquina("Variavel");

		adicionaEstadosETransicoesAlfa_ao(Alfa_ao);
		adicionaEstadosETransicoesAlfa_az(Alfa_az);
		adicionaEstadosETransicoesAlfa_pz(Alfa_pz);
		adicionaEstadosETransicoesAlfaAO(AlfaAO);
		adicionaEstadosETransicoesAlfaAz(AlfaAz);
		adicionaEstadosETransicoesAlfaNumerico(AlfaNumerico);
		adicionaEstadosETransicoesAlfaNumericoFRT(AlfaNumericoFRT);
		adicionaEstadosETransicoesAlfaPZ(AlfaPZ);
		adicionaEstadosETransicoesAlfaUnder(AlfaUnder);
		adicionaEstadosETransicoesConnective(Connective);
		adicionaEstadosETransicoesConstante(Constante);
		adicionaEstadosETransicoesDigito(Digito);
		adicionaEstadosETransicoesFuncao(Funcao);
		adicionaEstadosETransicoesNTermo(NTermo);
		adicionaEstadosETransicoesPredicado(Predicado);
		adicionaEstadosETransicoesQualificador(Qualificador);
		adicionaEstadosETransicoesSentencaAtomica(SentencaAtomica);
		adicionaEstadosETransicoesTermo(Termo);
		adicionaEstadosETransicoesVariavel(Variavel);
	}
	
	private void adicionaEstadosETransicoesAlfa_ao(Maquina alfa_ao) {
		Estado q0 = new Estado("q0 alfa_ao", true, false);
		Estado q1 = new Estado("q1 alfa_ao", false, true);
		q0.addTransicao(new TransicaoPorSimbolo(q1, "a", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "b", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "c", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "d", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "e", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "f", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "g", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "h", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "i", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "j", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "k", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "l", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "m", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "n", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "o", false));
		alfa_ao.setEstadoInicial(q0);
	}

	private void adicionaEstadosETransicoesAlfa_az(Maquina alfa_az) {
		Estado q0 = new Estado("q1 ALFA az", true, false);
		Estado q1 = new Estado("q2 ALFA az", false, true);
		q0.addTransicao(new TransicaoPorMaquina(q1, Alfa_ao, false));
		q0.addTransicao(new TransicaoPorMaquina(q1, Alfa_pz, false));
		alfa_az.setEstadoInicial(q0);
	}

	private void adicionaEstadosETransicoesAlfa_pz(Maquina alfa_pz) {
		Estado q0 = new Estado("q0 alfa_pz", true, false);
		Estado q1 = new Estado("q1 alfa_pz", false, true);
		q0.addTransicao(new TransicaoPorSimbolo(q1, "p", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "q", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "r", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "s", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "t", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "u", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "v", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "w", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "x", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "y", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "z", false));
		alfa_pz.setEstadoInicial(q0);
	}

	private void adicionaEstadosETransicoesAlfaAO(Maquina alfaAO) {
		Estado q0 = new Estado("q0 alfaAO", true, false);
		Estado q1 = new Estado("q1 alfaAO", false, true);
		q0.addTransicao(new TransicaoPorSimbolo(q1, "A", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "B", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "C", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "D", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "E", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "F", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "G", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "H", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "I", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "J", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "K", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "L", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "M", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "N", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "O", false));
		alfaAO.setEstadoInicial(q0);
	}

	private void adicionaEstadosETransicoesAlfaAz(Maquina alfaAz) {
		Estado q0 = new Estado("q0 alfaAz", true, false);
		Estado q1 = new Estado("q1 alfaAz", false, true);
		q0.addTransicao(new TransicaoPorMaquina(q1, AlfaAO, false));
		q0.addTransicao(new TransicaoPorMaquina(q1, AlfaPZ, false));
		alfaAz.setEstadoInicial(q0);
	}

	private void adicionaEstadosETransicoesAlfaNumerico(Maquina alfaNumerico) {
		Estado q0 = new Estado("q0 alfaNumerico", true, false);
		Estado q1 = new Estado("q1 alfaNumerico", false, true);
		q0.addTransicao(new TransicaoPorMaquina(q1,Alfa_az, false));
		q0.addTransicao(new TransicaoPorMaquina(q1, AlfaAz, false));
		q0.addTransicao(new TransicaoPorMaquina(q1, Digito, false));
		alfaNumerico.setEstadoInicial(q0);
	}

	private void adicionaEstadosETransicoesAlfaNumericoFRT(Maquina alfaNumericoFRT) {
		Estado qi = new Estado("qi alfaNumericoFRT", true, true);
		qi.addTransicao(new TransicaoPorMaquina(qi, AlfaNumerico, false));
		alfaNumericoFRT.setEstadoInicial(qi);
	}

	private void adicionaEstadosETransicoesAlfaPZ(Maquina alfaPZ) {
		Estado q0 = new Estado("q0 alfaPZ", true, false);
		Estado q1 = new Estado("q1 alfaPZ", false, true);
		q0.addTransicao(new TransicaoPorSimbolo(q1, "P", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "Q", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "R", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "S", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "T", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "U", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "V", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "W", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "X", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "Y", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "Z", false));
		alfaPZ.setEstadoInicial(q0);
	}

	private void adicionaEstadosETransicoesAlfaUnder(Maquina alfaUnder) {
		Estado q0 = new Estado("q0 alfaUnder", true, false);
		Estado q1 = new Estado("q1 alfaUnder", false, true);
		q0.addTransicao(new TransicaoPorMaquina(q1, AlfaNumerico, false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "_", false));
		alfaUnder.setEstadoInicial(q0);
	}

	private void adicionaEstadosETransicoesConnective(Maquina connective) {
		Estado qi = new Estado("qi connective", true, false);
		Estado qf = new Estado("qf connective", false, true);
		Estado q1 = new Estado("q1 connective", false, false);
		Estado q2 = new Estado("q2 connective", false, false);
		Estado q3 = new Estado("q3 connective", false, false);
		Estado q4 = new Estado("q4 connective", false, false);
		Estado q5 = new Estado("q5 connective", false, false);
		Estado q6 = new Estado("q6 connective", false, false);
		qi.addTransicao(new TransicaoPorSimbolo(q1, "&", false));
		q1.addTransicao(new TransicaoPorSimbolo(qf, "&", false));
		qi.addTransicao(new TransicaoPorSimbolo(q2, "|", false));
		q2.addTransicao(new TransicaoPorSimbolo(qf, "|", false));
		qi.addTransicao(new TransicaoPorSimbolo(q3, "-", false));
		q3.addTransicao(new TransicaoPorSimbolo(qf, ">", false));
		qi.addTransicao(new TransicaoPorSimbolo(q4, "<", false));
		q4.addTransicao(new TransicaoPorSimbolo(q5, "-", false));
		q5.addTransicao(new TransicaoPorSimbolo(qf, ">", false));
		qi.addTransicao(new TransicaoPorSimbolo(q6, "=", false));
		q6.addTransicao(new TransicaoPorSimbolo(qf, "=", false));
		connective.setEstadoInicial(qi);
	}

	private void adicionaEstadosETransicoesConstante(Maquina constante) {
		Estado qi = new Estado("q1 CONSTANTE", true, false);
		Estado qf = new Estado("q2 CONSTANTE", false, true);
		qi.addTransicao(new TransicaoPorMaquina(qf, Alfa_az, false));
		qf.addTransicao(new TransicaoPorMaquina(qf, AlfaNumerico, false));
		constante.setEstadoInicial(qi);
	}

	private void adicionaEstadosETransicoesDigito(Maquina digito) {
		Estado q0 = new Estado("q0 digito", true, false);
		Estado q1 = new Estado("q1 digito", false, true);
		q0.addTransicao(new TransicaoPorSimbolo(q1, "0", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "1", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "2", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "3", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "4", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "5", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "6", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "7", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "8", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "9", false));
		digito.setEstadoInicial(q0);
	}

	private void adicionaEstadosETransicoesFuncao(Maquina funcao) {
		Estado q1 = new Estado("q1 funcao", true, false);
		Estado q2 = new Estado("q2 funcao", false, false);
		Estado q3 = new Estado("q3 funcao", false, true);
		q1.addTransicao(new TransicaoPorMaquina(q3, Alfa_ao, false));
		q1.addTransicao(new TransicaoPorMaquina(q2, Alfa_pz, false));
		q2.addTransicao(new TransicaoPorMaquina(q3, AlfaUnder, false));
		q3.addTransicao(new TransicaoPorMaquina(q3, AlfaUnder, false));
		funcao.setEstadoInicial(q1);
	}

	private void adicionaEstadosETransicoesNTermo(Maquina nTermo) {
		Estado q1 = new Estado("q1 NTERMO", true, false);
		Estado q2 = new Estado("q2 NTERMO", false, true);
		Estado q3 = new Estado("q3 NTERMO", false, false);
		q1.addTransicao(new TransicaoPorMaquina(q2, Termo, false));
		q2.addTransicao(new TransicaoPorSimbolo(q3, ",", false));
		q3.addTransicao(new TransicaoPorMaquina(q2, NTermo, false));
		nTermo.setEstadoInicial(q1);
	}

	private void adicionaEstadosETransicoesPredicado(Maquina predicado) {
		Estado q1 = new Estado("q1 predicado", true, false);
		Estado q2 = new Estado("q2 predicado", false, false);
		Estado q3 = new Estado("q3 predicado", false, true);
		q1.addTransicao(new TransicaoPorMaquina(q3, Alfa_pz,false));
		q1.addTransicao(new TransicaoPorMaquina(q2, Alfa_ao,false));
		q2.addTransicao(new TransicaoPorMaquina(q3, AlfaUnder,false));
		q3.addTransicao(new TransicaoPorMaquina(q3, AlfaUnder,false));
		predicado.setEstadoInicial(q1);
	}

	private void adicionaEstadosETransicoesQualificador(Maquina qualificador) {
		Estado q0 = new Estado("q0 qualificador", true, false);
		Estado q1 = new Estado("q1 qualificador", false, true);
		q0.addTransicao(new TransicaoPorSimbolo(q1, "£", false));
		q0.addTransicao(new TransicaoPorSimbolo(q1, "@", false));
		qualificador.setEstadoInicial(q0);
	}

	private void adicionaEstadosETransicoesSentencaAtomica(Maquina sentencaAtomica) {
		Estado q1 = new Estado("q1 sentencaAtomica", true, false);
		Estado q2 = new Estado("q2 sentencaAtomica", false, false);
		Estado q3 = new Estado("q3 sentencaAtomica", false, false);
		Estado q4 = new Estado("q4 sentencaAtomica", false, false);
		Estado q5 = new Estado("q5 sentencaAtomica", false, false);
		Estado q6 = new Estado("q6 sentencaAtomica", false, false);
		Estado q7 = new Estado("q7 sentencaAtomica", false, false);
		Estado q8 = new Estado("q8 sentencaAtomica", false, true);
		q1.addTransicao(new TransicaoPorMaquina(q8, Constante, false));
		q1.addTransicao(new TransicaoPorMaquina(q8, Variavel, false));
		q1.addTransicao(new TransicaoPorMaquina(q2, Predicado, false));
		q2.addTransicao(new TransicaoPorSimbolo(q3, "(", false));
		q3.addTransicao(new TransicaoPorMaquina(q4, Termo, false));
		q4.addTransicao(new TransicaoPorSimbolo(q5, ",", false));
		q5.addTransicao(new TransicaoPorMaquina(q6, Termo,false));
		q6.addTransicao(new TransicaoPorSimbolo(q7, ")", false));
		q7.addTransicao(new TransicaoPorSimbolo(q8, ".", false));
		sentencaAtomica.setEstadoInicial(q1);
	}

	private void adicionaEstadosETransicoesTermo(Maquina termo) {
		Estado q1 = new Estado("q1 TERMO", true, false);
		Estado q2 = new Estado("q2 TERMO", false, false);
		Estado q3 = new Estado("q3 TERMO", false, false);
		Estado q4 = new Estado("q4 TERMO", false, false);
		Estado q5 = new Estado("q5 TERMO", false, true);
		q1.addTransicao(new TransicaoPorMaquina(q2, Funcao, false));
		q2.addTransicao(new TransicaoPorSimbolo(q3, "(", false));
		q3.addTransicao(new TransicaoPorMaquina(q4, NTermo, false));
		q4.addTransicao(new TransicaoPorSimbolo(q5, ")", false));
		q1.addTransicao(new TransicaoPorMaquina(q5, Constante, false));
		q1.addTransicao(new TransicaoPorMaquina(q5, Variavel, false));
		termo.setEstadoInicial(q1);
	}

	private void adicionaEstadosETransicoesVariavel(Maquina variavel) {
		Estado qi = new Estado("q1 variavel", true, false);
		Estado qf = new Estado("q2 variavel", false, true);
		qi.addTransicao(new TransicaoPorMaquina(qf, AlfaAz, false));
		qf.addTransicao(new TransicaoPorMaquina(qf, AlfaNumerico, false));
		variavel.setEstadoInicial(qi);
	}


}
