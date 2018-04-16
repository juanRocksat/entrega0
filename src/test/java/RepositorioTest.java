import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import usuario.Cliente;
import usuario.Dispositivo;
import usuario.Documento;
import usuario.Fecha;

public class RepositorioTest {
	
	
	Repositorio r;
	
	Dispositivo d1;
	Dispositivo d2;
	Dispositivo d3;
	Dispositivo d4;
	
	List<Dispositivo> ds1 = new ArrayList<Dispositivo>();
	List<Dispositivo> ds2 = new ArrayList<Dispositivo>();
	
	Fecha f1;
	Fecha f2;
	
	Documento dni1;
	Documento dni2;
	
	Cliente c1;
	Cliente c2;

	@Before
	public void setUp() throws Exception {
		
		d1 = new Dispositivo("Lavarropa", 500 , false);
		d2 = new Dispositivo("Televisor", 100 , true);;
		d3 = new Dispositivo("Plancha", 1500 , false);;
		d4 = new Dispositivo("Planchita", 5000 , true);;
		
		ds1.add(d1);
		ds1.add(d2);
		
		ds2.add(d3);
		ds2.add(d4);
		
		
		f1 = new Fecha(1,2,2018);
		f2 = new Fecha(29,1,2018);
		
		dni1 = new Documento("DNI",111);
		dni2 = new Documento("DNI",222);
		
		c1 = new Cliente("Jose Maria", "Sola", dni1, "4444-5555", "Mozart 123", "jms", "123", f1, ds1);
		c2 = new Cliente("Maria Elena", "Fuseneco", dni2, "6666-7777", "Medrano 456", "mef", "456", f2, ds2);
		
		r = new Repositorio("clientes.json");
		
		r.vaciar();
		
	}
	
	
	
	
	//Guarda dos clientes en el repositorio
	@Test
	public void agregarCliente() {
		r.agregar(c1);
		r.agregar(c2);
		assertEquals(2,r.cantidadDeClientes());		
	}
	
	
	//Guarda y borra un cliente
	@Test
	public void borrarCliente() {
		r.agregar(c1);
		r.borrar(c1);
		assertEquals(0,r.cantidadDeClientes());
	}
	
	
	//Guarda y borra dos clientes
	@Test
	public void borrarCliente2() {
		r.agregar(c1);
		r.agregar(c2);
		assertEquals(2,r.cantidadDeClientes());
		r.borrar(c1);
		r.borrar(c2);
		assertEquals(0,r.cantidadDeClientes());
	}
	
	

}
