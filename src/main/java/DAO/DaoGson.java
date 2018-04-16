package DAO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import Archivo.Archivo;
import usuario.Cliente;

public class DaoGson implements Dao{
	
	List<Cliente> clientes = new ArrayList<Cliente>();
	Archivo archivo;
	
	public DaoGson(Archivo archivo) {
		this.archivo = archivo;
	}
	
	public void cargarLista() {
		Gson g = new Gson();
		String texto = archivo.leer();
		Type clienteListType = new TypeToken<ArrayList<Cliente>>() {}.getType();
		clientes = g.fromJson(texto,clienteListType);
	}
	
	public void copiarLista() {
		Gson g = new Gson();
		archivo.escribir(g.toJson(clientes));
	}

	@Override
	public void agregar(Object o) {
		Cliente c = (Cliente) o;
		this.cargarLista();
		clientes.add(c);
		this.copiarLista();
	}

	@Override
	public void borrar(Object o) {
		Cliente cliente = (Cliente) o;
		this.cargarLista();
		Cliente[] lista = new Cliente[clientes.size()];
		lista = clientes.toArray(lista);
		for(Cliente c: lista) {
			if(c.numeroDocumento()==cliente.numeroDocumento()) {
				clientes.remove(c);
			}
		}
		this.copiarLista();
	}

	@Override
	public void actualizar(Object o) {
		this.borrar(o);
		this.agregar(o);
	}

	@Override
	public List<?> getAll() {
		this.cargarLista();
		return clientes;
	}
	
	public void vaciar() {
		archivo.escribir("[]");
	}

}
