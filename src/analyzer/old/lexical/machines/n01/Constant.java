package analyzer.old.lexical.machines.n01;

import analyzer.old.lexical.Machine;
import analyzer.old.lexical.TransitionMachine;
import analyzer.old.lexical.exception.TransitionCompare;
import analyzer.old.lexical.machines.TypesMachine;
import analyzer.old.lexical.machines.n00.AlfaMinusc;
import analyzer.old.lexical.machines.n00.AlfaNumeric;
import analyzer.old.lexical.State;

public class Constant {
	
	public static final Machine CONSTANT;
	
	static{
		CONSTANT = new Machine(TypesMachine.CONSTANT, 1);
		
		//STATES
		State q0 = new State("q0", 'I');
		State q1 = new State("q1", 'F');
		
		//TRANSITIONS
		TransitionMachine<Machine> t0 = new TransitionMachine<Machine>("t0",q0, q1, AlfaMinusc.ALFAminusc);
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
			CONSTANT.addState(q0);
			CONSTANT.addState(q1);					
		} catch (Exception e) {			
			System.out.println("[MACHINE CONSTANT]: " + e.getMessage());
		}
	}

}
