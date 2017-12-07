package analyzer.old.lexical.machines.n00;

import analyzer.old.lexical.Machine;
import analyzer.old.lexical.State;
import analyzer.old.lexical.TransitionState;
import analyzer.old.lexical.exception.TransitionCompare;
import analyzer.old.lexical.machines.TypesMachine;

public class Function2 {
	
	public static final Machine FUNCTION2;
	
	static{
		FUNCTION2 =  new Machine(TypesMachine.FUNCTION, 0);

		Character [] ao = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o'};
		Character [] pz = {'p','q','r','s','t','u','v','x','w','y','z'};
		Character [] alfaunder = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','X','W','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','x','w','y','z','0','1','2','3','4','5','6','7','8','9','_'};


		
		//STATE
		State q0 = new State("q0", 'I');
		State q1 = new State("q0", 'F');
		State q2 = new State("q0", 'T');
		
		//TRANSITIONS
		TransitionState<Character> t0 =  new TransitionState<Character>("t0", q0, q1, ao);
		TransitionState<Character> t1 =  new TransitionState<Character>("t0", q0, q2, pz);
		TransitionState<Character> t2 =  new TransitionState<Character>("t0", q2, q1, alfaunder);
		TransitionState<Character> t3 =  new TransitionState<Character>("t0", q1, q1, alfaunder);

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
			FUNCTION2.addState(q0);
			FUNCTION2.addState(q1);
			FUNCTION2.addState(q2);
		} catch (Exception e) {			
			System.out.println("[MACHINE FUNCTION]: " + e.getMessage());
		}
	}

}
