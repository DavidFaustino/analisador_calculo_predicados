package analyzer.old.lexical.machines.n02;

import analyzer.old.lexical.Machine;
import analyzer.old.lexical.TransitionMachine;
import analyzer.old.lexical.TransitionState;
import analyzer.old.lexical.exception.TransitionCompare;
import analyzer.old.lexical.machines.TypesMachine;
import analyzer.old.lexical.machines.n01.Constant;
import analyzer.old.lexical.machines.n01.Function;
import analyzer.old.lexical.machines.n01.Variable;
import analyzer.old.lexical.State;

public class Termo {
	
	public static final Machine TERMO = new Machine(TypesMachine.TERMO, 2);;
	
	static{
		//TERMO = new Machine(TypesMachine.TERMO, 2);
		
		State q0 = new State("q0", 'I');
		State q1 = new State("q1", 'T');
		State q2 = new State("q2", 'T');
		State q3 = new State("q3", 'T');
		State q4 = new State("q4", 'F');

//		TransitionMachine<Machine> t0 = new TransitionMachine<Machine>("t0",q0, q1, Function.FUNCTION);
//		TransitionState<Character> t1 = new TransitionState<Character>("t1", q1, q2, '(');
//		TransitionMachine<Machine> t2 = new TransitionMachine<Machine>("t2",q2, q3, NTermo.NTERMO);
//		TransitionState<Character> t4 = new TransitionState<Character>("t4", q3, q4, ')');
//		TransitionMachine<Machine> t5 = new TransitionMachine<Machine>("t5",q0, q4, Constant.CONSTANT);
//		TransitionMachine<Machine> t6 = new TransitionMachine<Machine>("t6",q0, q4, Variable.VARIABLE);

		TransitionMachine<Machine> t0 = new TransitionMachine<Machine>("t0",q0, q1, Function.FUNCTION);
		TransitionState<Character> t1 = new TransitionState<Character>("t1", q1, q2, '(');
		TransitionMachine<Machine> t2 = new TransitionMachine<Machine>("t2",q2, q3, NTermo.NTERMO);
		TransitionState<Character> t4 = new TransitionState<Character>("t4", q3, q4, ')');
		TransitionMachine<Machine> t5 = new TransitionMachine<Machine>("t5",q0, q4, Constant.CONSTANT);
		TransitionMachine<Machine> t6 = new TransitionMachine<Machine>("t6",q0, q4, Variable.VARIABLE);

		try {

			q0.addTransition(t5);
			q0.addTransition(t6);
			q0.addTransition(t0);
			q1.addTransition(t1);
			q2.addTransition(t2);
			q3.addTransition(t4);
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
		} catch (Exception e) {			
			System.out.println("[MACHINE TERMO]: " + e.getMessage());
		}
	}
	

}
