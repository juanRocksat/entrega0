import java.util.List;

import Archivo.Archivo;
import DAO.Dao;
import DAO.DaoGson;
import usuario.Cliente;

public class Repositorio {
	Archivo archivo;
	Dao adm;
	public Repositorio(String direccion){
		archivo = new Archivo(direccion);
		adm = new DaoGson(archivo);
	}
	
	public void agregar(Cliente c) {
		adm.agregar(c);
	}
	
	public void borrar(Cliente c) {
		adm.borrar(c);
	}
	
	public List<Cliente> getAll(){
		return (List<Cliente>)adm.getAll();
	}
	
	public int cantidadDeClientes() {
		return adm.getAll().size();
	}
	
	public void vaciar() {
		adm.vaciar();
	}

}
