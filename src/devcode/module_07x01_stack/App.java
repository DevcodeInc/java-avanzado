package devcode.module_07x01_stack;

import java.util.Stack;

public class App {

	public static void main(String[] args) {
		
		Stack<Integer> stacks = new Stack<Integer>();

		System.out.println("Lista vacia :  "  + stacks);		
		System.out.println("Est vacia la lista? :  "  + stacks.isEmpty());
		
		stacks.push(1);
		stacks.push(2);
		stacks.push(3);
		stacks.push(4);
		
		for (Integer stack : stacks) {
			System.out.println(stack);
		}	
		
		System.out.println("Elementos en la lista :  "  + stacks);		
		System.out.println("Lista no vacia :  "  + stacks.isEmpty());
        System.out.println("Borra el ultimo elemento :  "  + stacks.pop());
        System.out.println("Elementos restantes en la lista :  "  + stacks);
        System.out.println("Buscar un elemento especifico en la lista : "  + stacks.search(3));
        System.out.println("Buscar un elemento especifico en la lista : "  + stacks.search(6));
        System.out.println("Est vacia la lista? :  "  + stacks.isEmpty());
        System.out.println("Elemento tope en la lista :  "  + stacks.peek());
	}
}
