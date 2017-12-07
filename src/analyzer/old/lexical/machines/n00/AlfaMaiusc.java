package analyzer.old.lexical.machines.n00;

import analyzer.old.lexical.TransitionState;
import analyzer.old.lexical.machines.TypesMachine;
import analyzer.old.lexical.Machine;
import analyzer.old.lexical.State;
import analyzer.old.lexical.exception.TransitionCompare;

public class AlfaMaiusc {
	
	public static final Machine ALFAMaiusc;
	
	static{
		ALFAMaiusc = new Machine(TypesMachine.ALFAMaiusc, 0);
		Character [] maiusc = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','X','W','Y','Z'};
		
		//STATES
		State q0 = new State("q0", 'I');
		State q1 = new State("q1", 'F');
		
		//TRANSITIONS
		TransitionState<Character> t0 = new TransitionState<Character>("t0", q0, q1, maiusc);
		
		//ADD STATES
		try {
			q0.addTransition(t0);
		} catch (TransitionCompare e1) {
			e1.printStackTrace();
		}		

		try {
			ALFAMaiusc.addState(q0);
			ALFAMaiusc.addState(q1);
		} catch (Exception e) {
			System.out.println("[MACHINE ALFAMaiusc]: " + e.getMessage());
		}
		

	}

}
