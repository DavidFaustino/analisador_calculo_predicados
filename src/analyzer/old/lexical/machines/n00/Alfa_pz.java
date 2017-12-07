package analyzer.old.lexical.machines.n00;

import analyzer.old.lexical.Machine;
import analyzer.old.lexical.State;
import analyzer.old.lexical.TransitionState;
import analyzer.old.lexical.exception.TransitionCompare;
import analyzer.old.lexical.machines.TypesMachine;

public class Alfa_pz {

	public static final Machine ALFApz;
	
	static{
		ALFApz = new Machine(TypesMachine.ALFApz, 0);
		
		//STATES
		State q0 = new State("q0", 'I');
		State q1 = new State("q1", 'F');

		//TRANSITIONS		
		Character [] c = {'p','q','r','s','t','u','v','x','w','y','z'};
		TransitionState<Character> t0 = new TransitionState<Character>("t0", q0, q1, c);
		
		//ADD TRANSITION
		try {
			q0.addTransition(t0);
		} catch (TransitionCompare e1) {
			e1.printStackTrace();
		}
		
		try {
			ALFApz.addState(q0);
			ALFApz.addState(q1);
		} catch (Exception e) {
			System.out.println("[MACHINE ALFApz]: " + e.getMessage());
		}
		
	}
}
