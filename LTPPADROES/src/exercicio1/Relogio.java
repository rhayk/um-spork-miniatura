package exercicio1;

public class Relogio {

	//Eager ->  vai criar o objeto independentemente se o objeto for criado, desperdi�o de mem�ria;

	public static Data data = new Data(28, 03, 1997); 
	public static Horario horario = new Horario(8, 50, 35);

	public static Data getIntance(Data data) { 
		return data;
	
	}
	
	public static Horario getIntance(Horario horario) { 
		return horario;
	}
	
	@Override
	public String toString() {
		return "Data:"+ data +"Hor�rio:"+horario;
	}
	
}


