package analyzer.old.lexical.machines.n00;

import analyzer.old.lexical.Machine;
import analyzer.old.lexical.State;
import analyzer.old.lexical.TransitionState;
import analyzer.old.lexical.exception.TransitionCompare;
import analyzer.old.lexical.machines.TypesMachine;

public class Connective {

	public static final Machine CONNECTIVE;
	
	static{
		CONNECTIVE = new Machine(TypesMachine.CONNECTIVE, 0);
		
		//STATES
		State q0 = new State("q0", 'I');
		State q1 = new State("q1", 'T');
		State q2 = new State("q2", 'T');
		State q3 = new State("q3", 'T');
		State q4 = new State("q4", 'T');
		State q5 = new State("q5", 'T');
		State q6 = new State("q6", 'T');
		State q7 = new State("q7", 'F');

		//TRANSITIONS
		Character [] and = {'&'};		
		TransitionState<Character> t0 = new TransitionState<Character>("t0", q0, q1, and);
		TransitionState<Character> t1 = new TransitionState<Character>("t1", q1, q7, and);
		
		Character [] or = {'|'};		
		TransitionState<Character> t2 = new TransitionState<Character>("t2", q0, q2, or);
		TransitionState<Character> t3 = new TransitionState<Character>("t3", q2, q7, or);
		
		Character [] equal = {'='};		
		TransitionState<Character> t4 = new TransitionState<Character>("t4", q0, q3, equal);
		TransitionState<Character> t5 = new TransitionState<Character>("t5", q3, q7, equal);
		
		Character [] conj1 = {'-'};		
		Character [] conj2 = {'>'};		
		TransitionState<Character> t6 = new TransitionState<Character>("t6", q0, q4, conj1);
		TransitionState<Character> t7 = new TransitionState<Character>("t7", q4, q7, conj2);
		
		Character [] bicon1 = {'<'};		
		Character [] bicon2 = {'-'};		
		Character [] bicon3 = {'>'};		
		TransitionState<Character> t8 = new TransitionState<Character>("t0", q0, q5, bicon1);
		TransitionState<Character> t9 = new TransitionState<Character>("t0", q5, q6, bicon2);
		TransitionState<Character> t10 = new TransitionState<Character>("t0", q6, q7, bicon3);
		
		
		//ADD TRANSITION
		try {
			q0.addTransition(t0);
			q0.addTransition(t2);
			q0.addTransition(t4);
			q0.addTransition(t6);
			q0.addTransition(t8);
			
			q1.addTransition(t1);
			q2.addTransition(t3);
			q3.addTransition(t5);
			q4.addTransition(t7);
			q5.addTransition(t9);
			
			q6.addTransition(t10);
		} catch (TransitionCompare e1) {
			e1.printStackTrace();
		}
		
		try {
			CONNECTIVE.addState(q0);
			CONNECTIVE.addState(q1);
			CONNECTIVE.addState(q2);
			CONNECTIVE.addState(q3);
			CONNECTIVE.addState(q4);
			CONNECTIVE.addState(q5);
			CONNECTIVE.addState(q6);
			CONNECTIVE.addState(q7);
		} catch (Exception e) {
			System.out.println("[MACHINE CONNECTIVE]: " + e.getMessage());
		}
		
	}
}
