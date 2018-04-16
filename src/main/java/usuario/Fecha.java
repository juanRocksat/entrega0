package usuario;

public class Fecha {
	//Attributes
	int dia;
	int mes;
	int anio;
	
	//Constructor
	public Fecha(int dia, int mes, int anio){
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;
	}
	
	
	public String formato() {
		return dia+"/"+mes+"/"+anio;
	}
	
	public void mostrar() {
		System.out.println(this.formato());	
	}
	
	

}
