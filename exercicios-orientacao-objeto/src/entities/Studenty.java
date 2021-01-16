package entities;

public class Studenty {
	
	
	private String name;
	private double nota1;
	private double nota2;
	private double nota3;
	private double total;
	
	
	public Double totalNotas() {
		this.total = nota1 + nota2 + nota3;
		return total;
		
	}
	
	
	public Double media() {
		return total / 3;
		
	}

}
