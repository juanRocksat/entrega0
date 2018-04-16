package categoria;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Categoria.CategoriaDB;
import junit.framework.Assert;
import usuario.Cliente;

public class Categoria {
	Cliente juan =new Cliente("Juan","R1"); 
	CategoriaDB categorias=new CategoriaDB();
	
	@Test
	public void categoriaIndicadaParaElNumeroAdecuado() {
		assertEquals(categorias.getCategoria(1).toString(),"R1");
	}
	@Test
	public void categoriaIndicadaParaElSujetoAdecuado() {
		assertEquals(categorias.getCategoria(juan).toString(),"R1");
	}	
//	@Test
//	public void juanPagaEntreCategoria1() {
//		double gastos = categorias.obtenerGastosDe(juan);
//		assertTrue(0<= gastos && gastos<=150);
//	}
	
}
