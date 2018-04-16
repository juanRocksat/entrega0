package usuario;

public class Dispositivo {
	
	
	//Por defecto se crea apagado a menos que le informes
	boolean estado = false;
	float consumo;
	String nombre;
	
	
	
	public Dispositivo(String nombre, float consumo, boolean estado) {
		this.nombre = nombre;
		this.consumo = consumo;
		this.estado = estado;
	}
	
	public void apagar() {
		estado = false;
	}
	
	public void prender() {
		estado = true;
	}
	
	public boolean estado() {
		return estado;
	}
	
	public String nombre() {
		return this.nombre;
	}
	
	public float consumo() {
		return consumo;
	}
	

}
