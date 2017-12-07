package analyzer.old.lexical.machines.n00;

import analyzer.old.lexical.TransitionState;
import analyzer.old.lexical.machines.TypesMachine;
import analyzer.old.lexical.Machine;
import analyzer.old.lexical.State;
import analyzer.old.lexical.exception.TransitionCompare;

public class SymbolUnder {
	
	public static final Machine SYMBOLUNDER;
	
	static{
		SYMBOLUNDER =  new Machine(TypesMachine.SYMBOLUNDER, 0);
		
		//STATE
		State q0 = new State("q0", 'I');
		State q1 = new State("q1", 'F');
		
		//TRANSITIONS
		TransitionState<Character> t0 = new TransitionState<Character>("t0", q0, q1, '_');

		
		//ADD STATES
		try {
			q0.addTransition(t0);
		} catch (TransitionCompare e1) {			
			e1.printStackTrace();
		}

		
		try {
			//ADD STATES
			SYMBOLUNDER.addState(q0);
			SYMBOLUNDER.addState(q1);
		} catch (Exception e) {			
			System.out.println("[MACHINE SYMBOLUNDER]: " + e.getMessage());
		}
	}

}
