package analyzer.old.lexical.exception;

@SuppressWarnings("serial")
public class MachineStateExists extends Exception {

	public MachineStateExists() {
		super("ESTADO INICIAL OU FINAL N�O EXISTE");
	}
}
