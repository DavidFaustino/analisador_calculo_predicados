package analyzer.old.lexical.machines.n00;

import analyzer.old.lexical.Machine;
import analyzer.old.lexical.State;
import analyzer.old.lexical.TransitionState;
import analyzer.old.lexical.exception.TransitionCompare;
import analyzer.old.lexical.machines.TypesMachine;

public class Alfa_ao {

	public static final Machine ALFAao;
	
	static{
		ALFAao = new Machine(TypesMachine.ALFAao, 0);
		
		//STATES
		State q0 = new State("q0",'I');
		State q1 = new State("q1", 'F');

		//TRANSITIONS		
		Character [] c = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o'};
		TransitionState<Character> t0 = new TransitionState<Character>("t0", q0, q1, c);
		
		//ADD TRANSITION
		try {
			q0.addTransition(t0);
		} catch (TransitionCompare e1) {
			e1.printStackTrace();
		}
		
		try {
			ALFAao.addState(q0);
			ALFAao.addState(q1);
		} catch (Exception e) {
			System.out.println("[MACHINE ALFAao]: " + e.getMessage());
		}
		
	}
}
