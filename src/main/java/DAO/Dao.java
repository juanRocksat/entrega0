package DAO;

import java.util.List;

public interface Dao {
	
	public void agregar(Object o);
	public void borrar(Object o);
	public void actualizar(Object o);
	public List<?> getAll(); 
	public void vaciar();
}
