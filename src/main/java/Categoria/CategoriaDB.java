package Categoria;

import java.util.Hashtable;

public class CategoriaDB {
	private static Hashtable<Integer, Categoria> categorias;
	private static int idContadorCategorias;
	
	static {
		categorias=new Hashtable<>();
		categorias.put(1, new Categoria("R1", 0, 150, 19.76, 0.644));
		categorias.put(2, new Categoria("R2", 150, 325, 35.32, 0.644));
		categorias.put(3, new Categoria("R3", 325, 400, 60.71, 0.681));
		categorias.put(4, new Categoria("R4", 400, 450, 71.74, 0.738));
		categorias.put(5, new Categoria("R6", 500, 500, 110.38, 0.794));
		categorias.put(6, new Categoria("R6", 500, 600, 220.75, 0.832));
		categorias.put(7, new Categoria("R7", 600, 700, 443.59, 0.851));
		categorias.put(8, new Categoria("R8", 700, 1400, 545.96, 0.851));
		categorias.put(9, new Categoria("R9", 1400, Double.POSITIVE_INFINITY, 887.19, 0.851));
		idContadorCategorias=categorias.size()+1;
	}
	//lo que importa es abajo , asi lo hacemos dinamico la tabla de categoria
	public static Categoria buscarCategoria( int categoria) {
		return categorias.get(categoria);
	}
	public static int addCategoria(String cat ,long cotaMin,double cotaMaxima,double fijo,double variablee) {
		Categoria nuevo = new Categoria(cat, cotaMin, cotaMaxima, fijo, variablee);
		categorias.put(idContadorCategorias, nuevo);
		return 	idContadorCategorias++;
	}
	public static void updateCategoria(int idCategoria ,long cotaMin,double cotaMaxima,double fijo,double variablee) {
		Categoria aux = buscarCategoria(idCategoria);
		aux.setCargoFijo(fijo);
		aux.setCargoVariableFactor(variablee);
		aux.setCotaInferior(cotaMin);
		aux.setCotaSuperior(cotaMaxima);
	}
	public static void eliminarCategoria(int categoria) {
		categorias.remove(categoria);
	}
	
	
	
	//getters y setters
	public static Hashtable<Integer, Categoria> getCategorias() {
		return categorias;
	}
	public static void setCategorias(Hashtable<Integer, Categoria> categorias) {
		CategoriaDB.categorias = categorias;
	}
	public static int getIdContadorCategorias() {
		return idContadorCategorias;
	}
	public static void setIdContadorCategorias(int idContadorCategorias) {
		CategoriaDB.idContadorCategorias = idContadorCategorias;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
