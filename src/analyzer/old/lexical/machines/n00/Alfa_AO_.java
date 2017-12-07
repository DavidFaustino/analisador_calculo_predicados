package analyzer.old.lexical.machines.n00;

import analyzer.old.lexical.Machine;
import analyzer.old.lexical.State;
import analyzer.old.lexical.TransitionState;
import analyzer.old.lexical.exception.TransitionCompare;
import analyzer.old.lexical.machines.TypesMachine;

public class Alfa_AO_ {

	public static final Machine ALFA_AO_;
	
	static{
		ALFA_AO_ = new Machine(TypesMachine.ALFA_AO_, 0);
		
		//STATES
		State q0 = new State("q0", 'I');
		State q1 = new State("q1", 'F');

		//TRANSITIONS
		Character [] c = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'};
		TransitionState<Character> t0 = new TransitionState<Character>("t0", q0, q1, c);
		
		//ADD TRANSITION
		try {
			q0.addTransition(t0);
		} catch (TransitionCompare e1) {
			e1.printStackTrace();
		}
		
		try {
			ALFA_AO_.addState(q0);
			ALFA_AO_.addState(q1);
		} catch (Exception e) {
			System.out.println("[MACHINE ALFA_AO_]: " + e.getMessage());
		}
		
	}
}
