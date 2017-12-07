package analyzer.old.lexical.test;

import analyzer.old.lexical.exception.MachineAddState;
import analyzer.old.lexical.machines.TypesMachine;
import analyzer.old.lexical.Machine;
import analyzer.old.lexical.State;

public class TestMachine {
	
	public static void main(String[] args) throws MachineAddState {
		State q0 = new State("q0", 'I');
		State q1 = new State("q0", 'T');
		State q2 = new State("q0", 'T');
		State q3 = new State("q0", 'T');
		State q4 = new State("q0", 'F');
		
		Machine m =  new Machine(TypesMachine.DIGIT, 0);
		m.addState(q0);
		m.addState(q1);
		m.addState(q2);
		m.addState(q3);
		m.addState(q4);
		
		/*for(State state : m.getListState()){
			
			System.out.println(state);
			
			if(state == q3){
				System.out.println("IGUAL:  " + q3);
			}
		}*/
	}

}
