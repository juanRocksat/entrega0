package Archivo;

import java.io.BufferedReader;
import java.io.FileReader;

public class Lector {
	Archivo archivo; 
	FileReader fr;
	BufferedReader br;
	
	Lector(Archivo archivo){
		this.archivo = archivo;
	}
	
	
	public String leer() {
		String contenido ="";
		try {
	         fr = new FileReader (archivo.archivo());
	         br = new BufferedReader(fr);
	         String linea;
	         while((linea=br.readLine())!=null) {
	        	 contenido+=linea; 
	         }
	      }catch(Exception e){
	         System.out.println(e.getMessage());;
	      }finally{
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.getMessage();
	         }
	      }
		return contenido;
	}
}

