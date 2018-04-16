package usuario;

public class Administrador extends Usuario {
	
	public int id;
	
	
	public Administrador(String nombres, String apellidos, String domicilio, String nombreUsuario, String pass_,
			Fecha fechaDeAlta_, int id) {
		super();
		this.nombre = nombres;
		this.apellido = apellidos;
		this.domicilio = domicilio;
//		this.nombreUsuario = nombreUsuario;
		this.pass = pass_;
		this.fechaDeAlta = fechaDeAlta_;
		this.id = id;
	}
	
	
	/*Saber la cantidad de meses que lleva de alta en el sistema
	 * Sin implementar aun.
	 * Hay que ver como tratar las fechas si las creamos nosotros mismo o usamos Calendar
	 * 
	 */
	public int cantMesesDeAlta() {
		return 1;
	}

}
