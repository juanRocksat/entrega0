package usuario;

import java.util.List;

public class Cliente extends Usuario{
	
	//Attributes
	String nombreUsuario;
	String categoria;
;
	/* int id; este atributo lo necesito para poder actualizar los datos de un cliente pero no
	 * hace falta implementarlo aun, mas adelante.
	*/
	List<Dispositivo> dispositivos;
	/*
	 * Falta implementar Categorias por eso no tiene ese atributo aun. 
	 */
	
	//Constructor segundo
	public Cliente(String nombres, String apellidos, Documento documento, String telefono, String domicilio, String nombreUsuario, String pass_, Fecha fecha, List<Dispositivo> dispositivos){
		super();
		this.nombre = nombres;
		this.apellido = apellidos;
		this.documento = documento;
		this.telefono = telefono;
		this.domicilio = domicilio;
		this.nombreUsuario = nombreUsuario;
		this.pass = pass_;
		this.fechaDeAlta = fecha;
	}
	
	//Constructor primero
	public Cliente(String nombres, String apellidos, String tipo, int numeroDocumento, String telefono, String domicilio,
			String nombreUsuario, String pass_, int dia, int mes, int anio, List<Dispositivo> dispositivos) {
		super();
		this.nombre = nombres;
		this.apellido = apellidos;
		this.documento = new Documento(tipo, numeroDocumento);
		this.telefono = telefono;
		this.domicilio = domicilio;
		this.nombreUsuario = nombreUsuario;
		this.pass=pass_;
		this.fechaDeAlta = new Fecha(dia, mes, anio);
		this.dispositivos = dispositivos;
	}
	//CONSTRUCTOR SIMPLE PARA test
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	//Methods
	public String formato() {
		return apellido+", "+nombre+"\n"
				+documento.formato()+"\n"
				+"Telefono: "+telefono+"\n"
				+"Domicilio: "+domicilio+"\n"
				+"Usuario: "+nombreUsuario+"\n"
				+"Contraseña: "+pass+"\n"
				+"Fecha de alta: "+fechaDeAlta.formato();
	}
	
	public void mostrar() {
		System.out.println(this.formato());
	}
	
	public void cargarDispositivo(Dispositivo d) {
		dispositivos.add(d);
	}
	public int dispositivos() {
		return dispositivos.size();
	}
	
	public boolean algunoEncendido() {
		return this.dispositivosEncendidos()>0;
	}
	
	
	
	public int dispositivosEncendidos() {
		Dispositivo[] lista = (Dispositivo[]) dispositivos.toArray();
		int c = 0;
		for(Dispositivo l : lista) {
			if(l.estado()) {
				c++;
			}
		}
		return c;
	}

	public int dispositivosApagados() {
		Dispositivo[] lista = (Dispositivo[]) dispositivos.toArray();
		int c = 0;
		for(Dispositivo l : lista) {
			if(!l.estado()) {
				c++;
			}
		}
		return c;
	}
	
	public int numeroDocumento() {
		return documento.numero();
	}
}
