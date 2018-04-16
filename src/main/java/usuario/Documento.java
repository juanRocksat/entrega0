package usuario;

public class Documento {
	
	//Attributes
	int numero;
	String tipo;
	String letras=null;
	
	//Constructor
	public Documento(String tipo, int numero){
		this.tipo = tipo;
		this.numero = numero; 
	}
	public Documento(int numero_) {
		// TODO Auto-generated constructor stub
		numero=numero_;
		letras=Integer.toString(numero_);
	}
	public String formato() {
		return tipo+":"+numero;
	}
	
	public void mostrar() {
		System.out.println(this.formato());
	}
	
	public int numero() {
		return numero;
	}
	
	
	
	
	//getters y setters
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	//probando cosas, se puede borrar
	public static void main(String[] args) {
		Documento d = new Documento(56543345);
		System.out.println(d.getTipo());
		
		
	    System.out.println("Valor Máximo Byte: " + Byte.MAX_VALUE);
	    System.out.println("Valor Mínimo Byte: " + Byte.MIN_VALUE);
	    System.out.println("Tipo\tMínimo\tMáximo");
	    System.out.println("byte\t" + Byte.MIN_VALUE + "\t" + Byte.MAX_VALUE);
	    System.out.println("short\t" + Short.MIN_VALUE + "\t" + Short.MAX_VALUE);
	    System.out.println("int\t" + Integer.MIN_VALUE + "\t" + Integer.MAX_VALUE);
	    System.out.println("long\t" + Long.MIN_VALUE + "\t" + Long.MAX_VALUE);
	    System.out.println("float\t" + Float.MIN_VALUE + "\t" + Float.MAX_VALUE);
	    System.out.println("double\t" + Double.MIN_VALUE + "\t" + Double.MAX_VALUE);
	}
}
