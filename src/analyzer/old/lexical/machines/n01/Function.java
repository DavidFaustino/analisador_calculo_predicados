package analyzer.old.lexical.machines.n01;

import analyzer.old.lexical.TransitionMachine;
import analyzer.old.lexical.machines.TypesMachine;
import analyzer.old.lexical.machines.n00.AlfaUnder;
import analyzer.old.lexical.Machine;
import analyzer.old.lexical.State;
import analyzer.old.lexical.exception.TransitionCompare;
import analyzer.old.lexical.machines.n00.Alfa_ao;
import analyzer.old.lexical.machines.n00.Alfa_pz;

public class Function {
	
	public static final Machine FUNCTION;
	
	static{
		FUNCTION =  new Machine(TypesMachine.FUNCTION, 1);
		
		//FUNCTION.setToken(true);
		
		//STATE
		State q0 = new State("q0", 'I');
		State q1 = new State("q1", 'F');
		State q2 = new State("q2", 'T');
		
		//TRANSITIONS
		TransitionMachine<Machine> t0 = new TransitionMachine<Machine>("t0",q0, q1, Alfa_ao.ALFAao);
		TransitionMachine<Machine> t1 = new TransitionMachine<Machine>("t1",q0, q2, Alfa_pz.ALFApz);
		TransitionMachine<Machine> t2 = new TransitionMachine<Machine>("t2",q2, q1, AlfaUnder.ALFAUNDER);
		TransitionMachine<Machine> t3 = new TransitionMachine<Machine>("t3",q1, q1, AlfaUnder.ALFAUNDER);
		
		//ADD STATES		
		try {
			q0.addTransition(t0);
			q0.addTransition(t1);
			q1.addTransition(t3);
			q2.addTransition(t2);
		} catch (TransitionCompare e1) {			
			e1.printStackTrace();
		}
		
		
		
		
		try {
			//ADD STATES
			FUNCTION.addState(q0);
			FUNCTION.addState(q1);
			FUNCTION.addState(q2);			
		} catch (Exception e) {			
			System.out.println("[MACHINE FUNCTION]: " + e.getMessage());
		}
	}

}
