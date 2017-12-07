package analyzer.old.lexical.machines.n01;

import analyzer.old.lexical.TransitionMachine;
import analyzer.old.lexical.machines.TypesMachine;
import analyzer.old.lexical.machines.n00.AlfaMaiusc;
import analyzer.old.lexical.Machine;
import analyzer.old.lexical.State;
import analyzer.old.lexical.exception.TransitionCompare;
import analyzer.old.lexical.machines.n00.AlfaNumeric;

public class Variable {
	
	public static final Machine VARIABLE;
	
	static{
		VARIABLE = new Machine(TypesMachine.VARIABLE, 1);
		
		//STATES
		State q0 = new State("q0", 'I');
		State q1 = new State("q1", 'F');
		
		//TRANSITIONS
		TransitionMachine<Machine> t0 = new TransitionMachine<Machine>("t0",q0, q1, AlfaMaiusc.ALFAMaiusc);
		TransitionMachine<Machine> t1 = new TransitionMachine<Machine>("t1",q1, q1, AlfaNumeric.ALFANumeric);
				
		//ADD STATES		
		try {
			q0.addTransition(t0);
			q1.addTransition(t1);
		} catch (TransitionCompare e1) {			
			e1.printStackTrace();
		}
		
		try {
			//ADD STATES
			VARIABLE.addState(q0);
			VARIABLE.addState(q1);					
		} catch (Exception e) {			
			System.out.println("[MACHINE VARIABLE]: " + e.getMessage());
		}
	}

}
