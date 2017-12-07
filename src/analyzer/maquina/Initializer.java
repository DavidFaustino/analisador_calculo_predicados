package analyzer.maquina;


public class Initializer {
	public static  boolean init(Maquina maquina, Fita fita) {
		fita.consumir();
		return maquina.aceita(fita, "") && fita.getConsumido()==null;
	}
}
