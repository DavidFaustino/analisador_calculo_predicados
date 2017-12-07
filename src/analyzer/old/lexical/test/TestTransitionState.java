package analyzer.old.lexical.test;

import analyzer.old.lexical.State;
import analyzer.old.lexical.TransitionState;

public class TestTransitionState {
	
	public static void main(String[] args) {
		State q0 = new State("q0", 'I');
		State q1 = new State("q0", 'F');
				
		Character [] c = {'a','b','c'};
		TransitionState<Character> t0 = new TransitionState<Character>("t0", q0, q1, c);
		
		System.out.println(t0.typeTo());
		System.out.println(t0.getNext() == q1);
		System.out.println(t0.getNext() == q0);
		
		System.out.println(t0.getOrigin() == q0);
		System.out.println(t0.getOrigin() == q1);
		
		for (Character character : t0.getList()) {
			System.out.println(character.charValue());
		}
		
		System.out.println(t0.isExistElement('a'));
		System.out.println(t0.isExistElement('g'));
		
	}
}
