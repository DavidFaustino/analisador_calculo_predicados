package analyzer.old.lexical;

import java.util.ArrayList;
import java.util.List;

import analyzer.old.lexical.exception.CaracterNotPermited;

public class Tape {
	
	private List<Character> tape;
	private int head;
	
	public Tape(String input_tape) throws CaracterNotPermited{
		tape = new ArrayList<Character>();
		setTape(input_tape);		
		head = 0;
	}
	
	private void setTape(String input_tape) throws CaracterNotPermited{
		System.out.println("\n[NEW TAPE]");
		for(char c : input_tape.replace(" ", "").toCharArray()){
			if(c != '\t' || c != '\n' || c != '\r' || c != '\f'){
				tape.add(c);
				System.out.println("[SYMBOL ADD TAPE]: " + c);
			}else{
				System.out.println("[PROIBIDO]: " + c);
				throw new CaracterNotPermited(c);
			}
		}
		tape.add('\0');
		System.out.println("[SYMBOL ADD TAPE]: " + '\0' + "\n");
	}
	
	public List<Character> getTape(){
		return tape;
	}
	
	public boolean consume(){
		if(head != tape.size()){			
			head++;
			System.out.println(toString());
			return true;
		}else{
			return false;
		}		
				
	}
	
	public char consumed() {
		return tape.get(head - 1);
	}

	public char nextCosumed(){
		return tape.get(head);
	}
	
	public int getHead(){
		return head;
	}

	public int getDistancia(){
		return ((tape.size() - 1) - head);
	}
	
	public String getString(){
		String resp = "";
		for (Character character : tape) {
			resp += character;
		}
		return resp;
	}
	
	public void setHead(int head){
		this.head = head;
	}

	public boolean isFinal(){
		if(head == getString().length()){
            return true;
        }else{
            return false;
        }
	}

	@Override
	public String toString() {
		 
		return "[TAPE]: " + getString() + " [HEAD]: " + (head) + " [CONSUMED]: " + consumed();
	}



}
