package analyzer.old.lexical.machines.n00;


import analyzer.old.lexical.machines.TypesMachine;
import analyzer.old.lexical.Machine;
import analyzer.old.lexical.State;
import analyzer.old.lexical.TransitionState;
import analyzer.old.lexical.exception.TransitionCompare;

public class Alfa_PZ_ {

	public static final Machine ALFA_PZ_;
	
	static{
		ALFA_PZ_ = new Machine(TypesMachine.ALFA_PZ_, 0);
		
		//STATES
		State q0 = new State("q0", 'I');
		State q1 = new State("q1", 'F');

		//TRANSITIONS		
		Character [] c = {'P','Q','R','S','T','U','V','X','W','Y','Z'};
		TransitionState<Character>  t0 = new TransitionState<Character> ("t0", q0, q1, c);
		
		//ADD TRANSITION
		try {
			q0.addTransition(t0);
		} catch (TransitionCompare e1) {			
			e1.printStackTrace();
		}
		
		try {
			ALFA_PZ_.addState(q0);
			ALFA_PZ_.addState(q1);
		} catch (Exception e) {
			System.out.println("[MACHINE ALFA_PZ_]: " + e.getMessage());
		}
		
	}
}
