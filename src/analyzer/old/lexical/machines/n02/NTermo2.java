package analyzer.old.lexical.machines.n02;

import analyzer.old.lexical.Machine;
import analyzer.old.lexical.State;
import analyzer.old.lexical.TransitionMachine;
import analyzer.old.lexical.TransitionState;
import analyzer.old.lexical.exception.TransitionCompare;
import analyzer.old.lexical.machines.TypesMachine;

public class NTermo2 {
	
	public static final Machine NTERMO;
	
	static{
		NTERMO = new Machine(TypesMachine.NTERMO, 0);
		
		State q0 = new State("q0", 'I');
		State q1 = new State("q0", 'F');
		State q2 = new State("q0", 'T');
		
		
		
		TransitionMachine<Machine> t0 = new TransitionMachine<Machine>("t0",q0, q1, Termo.TERMO);
		TransitionState<Character> t1 = new TransitionState<>("t0", q1, q2, ',');
		TransitionMachine<Machine> t2 = new TransitionMachine<Machine>("t1",q2, q1, NTermo2.NTERMO);
		
		
		
		try {
			q0.addTransition(t0);
			q1.addTransition(t1);
			q2.addTransition(t2);
			
		} catch (TransitionCompare e) {
			e.printStackTrace();
		}
		
		try {
			//ADD STATES
			NTERMO.addState(q0);
			NTERMO.addState(q1);					
			NTERMO.addState(q2);					
		} catch (Exception e) {			
			System.out.println("[MACHINE Nterm]: " + e.getMessage());
		}
	}
	

	

}
