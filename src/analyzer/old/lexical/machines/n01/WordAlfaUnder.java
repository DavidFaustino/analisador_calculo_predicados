package analyzer.old.lexical.machines.n01;

import analyzer.old.lexical.Machine;
import analyzer.old.lexical.State;
import analyzer.old.lexical.TransitionMachine;
import analyzer.old.lexical.exception.TransitionCompare;
import analyzer.old.lexical.machines.TypesMachine;
import analyzer.old.lexical.machines.n00.AlfaUnder;

public class WordAlfaUnder {
	
	public static final Machine WORDALFAUNDER;
	
	static{
		WORDALFAUNDER =  new Machine(TypesMachine.WORDALFAUNDER, 1);
		
		//STATE
		State q0 = new State("q0", 'I');
		State q1 = new State("q1", 'F');
		
		//TRANSITIONS
		TransitionMachine<Machine> t0 = new TransitionMachine<Machine>("t0",q0, q1, AlfaUnder.ALFAUNDER);
		TransitionMachine<Machine> t1 = new TransitionMachine<Machine>("t1",q1, q1, AlfaUnder.ALFAUNDER);
		
		//ADD STATES
		try {
			q0.addTransition(t0);
			q1.addTransition(t1);
		} catch (TransitionCompare e1) {
			e1.printStackTrace();
		}
		
		
		
		try {
			//ADD STATES
			WORDALFAUNDER.addState(q0);
			WORDALFAUNDER.addState(q1);
		} catch (Exception e) {			
			System.out.println("[MACHINE ALFANR]: " + e.getMessage());
		}
	}

}
