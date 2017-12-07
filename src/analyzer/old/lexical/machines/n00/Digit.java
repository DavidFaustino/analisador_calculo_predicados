package analyzer.old.lexical.machines.n00;

import analyzer.old.lexical.machines.TypesMachine;
import analyzer.old.lexical.Machine;
import analyzer.old.lexical.State;
import analyzer.old.lexical.TransitionState;
import analyzer.old.lexical.exception.TransitionCompare;

public class Digit {
	
	public static final Machine DIGIT;
	
	static {
		
		DIGIT =  new Machine(TypesMachine.DIGIT, 0);
		
		//STATES
		State q0 = new State("q0", 'I');
		State q1 = new State("q1", 'F');

		//TRANSITIONS
		
		Character [] c = {'0','1','2','3','4','5','6','7','8','9'};
		TransitionState<Character> t0 = new TransitionState<Character>("t0", q0, q1, c);
		
		//ADD TRANSITION
		try {
			q0.addTransition(t0);
		} catch (TransitionCompare e1) {
			e1.printStackTrace();
		}
		
		try {
			//ADD STATES
			DIGIT.addState(q0);
			DIGIT.addState(q1);
		} catch (Exception e) {
			System.out.println("[MACHINE NUMBER] : " + e.getMessage());
		}
		
	}	

}
