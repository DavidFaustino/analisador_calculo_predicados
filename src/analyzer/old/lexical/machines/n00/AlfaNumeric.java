package analyzer.old.lexical.machines.n00;


import analyzer.old.lexical.TransitionState;
import analyzer.old.lexical.machines.TypesMachine;
import analyzer.old.lexical.Machine;
import analyzer.old.lexical.State;
import analyzer.old.lexical.exception.TransitionCompare;

public class AlfaNumeric {
	
	public static final Machine ALFANumeric;
	
	static{
		ALFANumeric = new Machine(TypesMachine.ALFANumeric, 0);
		Character [] alfanr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','X','W','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','x','w','y','z','0','1','2','3','4','5','6','7','8','9'};
		
		//STATES
		State q0 = new State("q0", 'I');
		State q1 = new State("q1", 'F');
		
		//TRANSITIONS
		TransitionState<Character> t0 = new TransitionState<Character>("t0", q0, q1, alfanr);

		//ADD STATES
		try {
			q0.addTransition(t0);
		} catch (TransitionCompare e1) {			
			e1.printStackTrace();
		}		

		try {
			ALFANumeric.addState(q0);
			ALFANumeric.addState(q1);
		} catch (Exception e) {
			System.out.println("[MACHINE ALFANumeric]: " + e.getMessage());
		}
		

	}

}
