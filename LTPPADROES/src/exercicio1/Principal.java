package exercicio1;

import exercicio1.Relogio;

public class Principal {
	public static void main(String[] args) {
		
		
		Data data = new Data(28, 03, 1997);
		
		Horario horario = new Horario(8, 50, 35);
		
		System.out.println(data);
		
		System.out.println(horario);
		
		System.out.println("============================");
		Relogio.getIntance(data);
		Relogio.getIntance(horario);
		
		System.out.println(data);
		System.out.println(horario);
		
		
	}

	
}
