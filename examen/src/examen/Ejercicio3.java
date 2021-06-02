package examen;

import java.util.Deque;
import java.util.LinkedList;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer>pila = new LinkedList<>();
		pila.add(2);
		pila.add(13);
		pila.add(-42);
		pila.add(21);
		pila.add(4);
		pila.add(9);
		pila.add(14);
		pila.add(-3);
		pila.add(11);
		pila.add(5);
		System.out.println(pila);
		invertir(pila,15);
		System.out.println(pila);
		
		
	}
	public static void invertir(Deque<Integer> pila, int n) {
		
		try {
			if(n>0 && pila.size()>n && pila!=null) {
				Deque<Integer> pilAux = new LinkedList<Integer>();
				for(int i=0; i<n; i++) {
					pilAux.offer(pila.poll());
				}
				
				while(!pilAux.isEmpty()) {
					pila.offerFirst(pilAux.poll());
				}
				
			}
			
		}
		catch(IllegalArgumentException exception){
			
			System.out.println(exception.getMessage());
			
			
		}
	}

}
