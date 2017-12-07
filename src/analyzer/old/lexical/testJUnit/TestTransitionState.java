package analyzer.old.lexical.testJUnit;

import analyzer.old.lexical.State;
import analyzer.old.lexical.TransitionState;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTransitionState {

	Character [] c = {'a','b','c'};
	TransitionState<Character> ts;
	
	@Before
	public void createTransitionState(){
		ts = new TransitionState<Character>("ts", new State("q0", 'I'), new State("q1", 'F'), c);
	}
	
	@Test
	public void test1(){	
		Assert.assertEquals(true, ts.getList().get(0).equals('a'));		
	}
	
	
	@Test
	public void test3(){	
		Assert.assertEquals(false, ts.isEmpty());		
	}

}
