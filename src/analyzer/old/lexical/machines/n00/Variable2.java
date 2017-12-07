package analyzer.old.lexical.machines.n00;

import analyzer.old.lexical.Machine;
import analyzer.old.lexical.State;
import analyzer.old.lexical.TransitionState;
import analyzer.old.lexical.exception.TransitionCompare;
import analyzer.old.lexical.machines.TypesMachine;

public class Variable2 {
	
	public static final Machine VARIABLE2;
	
	static{
		VARIABLE2 = new Machine(TypesMachine.VARIABLE, 0);

		Character [] maius = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','X','W','Y','Z'};
		Character [] alfanr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','X','W','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','x','w','y','z','0','1','2','3','4','5','6','7','8','9'};

		//STATES
		State q0 = new State("q0", 'I');
		State q1 = new State("q0", 'F');
		
		//TRANSITIONS
		TransitionState<Character> t0 = new TransitionState<Character>("t0", q0, q1, maius);
		TransitionState<Character> t1 = new TransitionState<Character>("t0", q1, q1, alfanr);
				
		//ADD STATES		
		try {
			q0.addTransition(t0);
			q1.addTransition(t1);
		} catch (TransitionCompare e1) {
			e1.printStackTrace();
		}
		
		try {
			//ADD STATES
			VARIABLE2.addState(q0);
			VARIABLE2.addState(q1);
		} catch (Exception e) {			
			System.out.println("[MACHINE VARIABLE]: " + e.getMessage());
		}
	}

}
