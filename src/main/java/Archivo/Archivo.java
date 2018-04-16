package Archivo;

import java.io.File;

public class Archivo {
	
	String direccion;
	File archivo;
	public Archivo(String direccion){
		try {
			archivo = new File(direccion);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public File archivo() {
		return archivo;
	}
	
	public void escribir(String texto){
		try {
			Escritor e = new Escritor(this);
			e.escribir(texto);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public String leer() {
		String contenido = "";
		try {
			Lector l = new Lector(this);
			contenido = l.leer();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return contenido;
	}	
}
