package exercicio1;

public class Data {
	
	private byte dia;
	private byte mes;
	private short ano;
	
	public Data(int dia, int mes, int ano) {
		setDia(dia);
		setMes(mes);
		setAno(ano);
	}

	public byte getDia() {
		return dia;		
	}
	
	private void setDia(int dia) {
		if(dia > 0 && dia <= 31) {
			this.dia = (byte)dia;			
		}
		
	}
	
	
	public byte getMes() {
		return mes;	
	}

	private void setMes(int mes) {
		if(mes > 0 && mes <= 12) {
			this.mes = (byte)mes;
			
		}
		
	}
	
	public short getAno() {
		return ano;
	}
	
	private void setAno(int ano) {
		if(ano > 2000 && ano<= 2099) {
			this.ano = (short)ano;
			
		}
		
	}
	@Override
	public String toString() {
		return "Data: " +dia+ "/" +mes+ "/" +ano;
	}
	
		
}
