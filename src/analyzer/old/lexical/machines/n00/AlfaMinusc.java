package analyzer.old.lexical.machines.n00;

import analyzer.old.lexical.TransitionState;
import analyzer.old.lexical.machines.TypesMachine;
import analyzer.old.lexical.Machine;
import analyzer.old.lexical.State;
import analyzer.old.lexical.exception.TransitionCompare;

public class AlfaMinusc {
	
	public static final Machine ALFAminusc;
	
	static{
		ALFAminusc = new Machine(TypesMachine.ALFAminusc, 0);

		Character [] min = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','x','w','y','z'};
		
		//STATES
		State q0 = new State("q0", 'I');
		State q1 = new State("q1", 'F');
		
		//TRANSITIONS
		TransitionState<Character> t0 = new TransitionState<Character>("t0", q0, q1, min);

		//ADD STATES
		try {
			q0.addTransition(t0);
		} catch (TransitionCompare e1) {			
			e1.printStackTrace();
		}
		

		try {
			ALFAminusc.addState(q0);
			ALFAminusc.addState(q1);
		} catch (Exception e) {
			System.out.println("[MACHINE ALFAminusc]: " + e.getMessage());
		}
		

	}

}
