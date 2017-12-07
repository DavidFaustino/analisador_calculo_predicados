package analyzer.old.lexical.machines.n00;

import analyzer.old.lexical.Machine;
import analyzer.old.lexical.State;
import analyzer.old.lexical.TransitionState;
import analyzer.old.lexical.exception.TransitionCompare;
import analyzer.old.lexical.machines.TypesMachine;

public class Qualificador {

	public static final Machine QUALIFICADOR;
	
	static{
		QUALIFICADOR = new Machine(TypesMachine.QUALIFICADOR, 0);
		
		//STATES
		State q0 = new State("q0", 'I');
		State q1 = new State("q1", 'F');

		//TRANSITIONS
		Character [] c = {'£','@'};
		TransitionState<Character> t0 = new TransitionState<Character>("t0", q0, q1, c);
		
		//ADD TRANSITION
		try {
			q0.addTransition(t0);
		} catch (TransitionCompare e1) {
			e1.printStackTrace();
		}
		
		try {
			QUALIFICADOR.addState(q0);
			QUALIFICADOR.addState(q1);
		} catch (Exception e) {
			System.out.println("[MACHINE QUALIFICADOR]: " + e.getMessage());
		}
		
	}
}
