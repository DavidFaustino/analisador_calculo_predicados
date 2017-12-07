package analyzer.old.lexical.machines.n02;

import analyzer.old.lexical.TransitionMachine;
import analyzer.old.lexical.TransitionState;
import analyzer.old.lexical.machines.TypesMachine;
import analyzer.old.lexical.Machine;
import analyzer.old.lexical.State;
import analyzer.old.lexical.exception.TransitionCompare;
import analyzer.old.lexical.machines.n00.Constant2;
import analyzer.old.lexical.machines.n00.Function2;
import analyzer.old.lexical.machines.n00.Variable2;

public class Termo2 {
	
	public static final Machine TERMO;
	
	static{
		TERMO = new Machine(TypesMachine.TERMO, 0);
		
		State q0 = new State("q0", 'I');
		State q1 = new State("q0", 'T');
		State q2 = new State("q0", 'T');
		State q3 = new State("q0", 'T');
		State q4 = new State("q0", 'T');
		State q5 = new State("q0", 'F');
		
		TransitionMachine<Machine> t0 = new TransitionMachine<Machine>("t0",q0, q5, Constant2.CONSTANT2);
		TransitionMachine<Machine> t1 = new TransitionMachine<Machine>("t1",q0, q5, Variable2.VARIABLE2);
		
		TransitionMachine<Machine> t2 = new TransitionMachine<Machine>("t2",q0, q1, Function2.FUNCTION2);
		TransitionState<Character> t3 = new TransitionState<Character>("t0", q1, q2, '(');
		TransitionMachine<Machine> t4 = new TransitionMachine<Machine>("t4",q2, q3, NTermo.NTERMO);
		TransitionState<Character> t5 = new TransitionState<Character>("t0", q3, q4, ')');
		TransitionState<Character> t6 = new TransitionState<Character>("t0", q4, q5, '.');
		
		
		
		try {
			q0.addTransition(t0);
			q0.addTransition(t1);
			q0.addTransition(t2);
			q1.addTransition(t3);
			q2.addTransition(t4);
			q3.addTransition(t5);
			q4.addTransition(t6);
			
		} catch (TransitionCompare e) {
			e.printStackTrace();
		}
		
		try {
			//ADD STATES
			TERMO.addState(q0);
			TERMO.addState(q1);					
			TERMO.addState(q2);					
			TERMO.addState(q3);					
			TERMO.addState(q4);					
			TERMO.addState(q5);					
		} catch (Exception e) {			
			System.out.println("[MACHINE TERMO]: " + e.getMessage());
		}
	}
	

}
