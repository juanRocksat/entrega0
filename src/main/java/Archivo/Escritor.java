package Archivo;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Escritor {
	Archivo archivo;
    FileWriter fw;
    PrintWriter pw;
    
    Escritor(Archivo archivo){
    	this.archivo = archivo;
    }
    
    public void escribir(String texto) {
    	 try
         {
             fw = new FileWriter(archivo.archivo());
             pw = new PrintWriter(fw);
             pw.print(texto);
             
         } catch (Exception e) {
             System.out.println(e.getMessage());;
         } finally {
            try {
            if (fw != null)
               fw.close();
            } catch (Exception e2) {
               System.out.println(e2.getMessage());;
            }
         }
    }
}
