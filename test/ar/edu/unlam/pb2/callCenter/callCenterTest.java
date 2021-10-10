package ar.edu.unlam.pb2.callCenter;

import static org.junit.Assert.*;

import org.junit.Test;

public class callCenterTest {

	@Test
	public void queSePuedaDarDeAltaUnContacto() {
		Celular celular1 = new Celular(549,011,1535080634);
		Contacto contacto1 = new Contacto("Cintia Pinaud",celular1,"cintiapinaud@gmail.com","Tapalque 230",1706,Localidad.Haedo,Provincia.BUENOSAIRES);
		assertNotNull(contacto1);
	}
	@Test
	public void queSePuedaRealizarUnaNuevaLlamada() {
		Celular celular1 = new Celular(549,011,1535080634);
		Contacto contacto1 = new Contacto("Cintia Pinaud",celular1,"cintiapinaud@gmail.com","Tapalque 230",1706,Localidad.Haedo,Provincia.BUENOSAIRES);
		Celular celular2 = new Celular(549,011,1562881349);
		Contacto contacto2 = new Contacto("Nadia Corvini",celular2,"nadiacorvini@gmail.com","Tapalque 230",1234,Localidad.Haedo,Provincia.BUENOSAIRES);
		Celular celular3 = new Celular(549,011,1533897799);
		Contacto contacto3 = new Contacto("Marcela Sartori",celular3,"marcelasartori@gmail.com","Tapalque 230",2222,Localidad.Haedo,Provincia.BUENOSAIRES);
		Contacto contactos[] = {contacto1,contacto2,contacto3};
		Integer cPValido[] = {1706,1904,1132};
		Empresa empresa1 = new Empresa("Nadia Inc.",contactos,cPValido);
		Contacto valorEsperado = contacto1;
		Contacto valorObtenido = empresa1.realizarNuevaLlamada();
		assertEquals(valorEsperado, valorObtenido);
		
	}
	
	@Test
	public void queElContactoSeaClienteSiLaLlamadaFueExitosa() {
		Celular celular1 = new Celular(549,011,1535080634);
		Contacto contacto1 = new Contacto("Cintia Pinaud",celular1,"cintiapinaud@gmail.com","Tapalque 230",1706,Localidad.Haedo,Provincia.BUENOSAIRES);
		Celular celular2 = new Celular(549,011,1562881349);
		Contacto contacto2 = new Contacto("Nadia Corvini",celular2,"nadiacorvini@gmail.com","Tapalque 230",1234,Localidad.Haedo,Provincia.BUENOSAIRES);
		Celular celular3 = new Celular(549,011,1533897799);
		Contacto contacto3 = new Contacto("Marcela Sartori",celular3,"marcelasartori@gmail.com","Tapalque 230",2222,Localidad.Haedo,Provincia.BUENOSAIRES);
		Contacto contactos[] = {contacto1,contacto2,contacto3};
		Integer cPValido[] = {1706,1904,1132};
		Empresa empresa1 = new Empresa("Nadia Inc.",contactos,cPValido);
		Contacto contactoLlamado = empresa1.realizarNuevaLlamada();
		contactoLlamado.lLamadaExitosa("Acepta propuesta");
		Boolean esCliente = contactoLlamado.getEsCliente();
		assertTrue(esCliente);
		
	}
	
	@Test
	public void queLlamarNuevamenteSeaFalseSiLaLlamadaEsExitosa() {
		Celular celular1 = new Celular(549,011,1535080634);
		Contacto contacto1 = new Contacto("Cintia Pinaud",celular1,"cintiapinaud@gmail.com","Tapalque 230",1706,Localidad.Haedo,Provincia.BUENOSAIRES);
		Celular celular2 = new Celular(549,011,1562881349);
		Contacto contacto2 = new Contacto("Nadia Corvini",celular2,"nadiacorvini@gmail.com","Tapalque 230",1234,Localidad.Haedo,Provincia.BUENOSAIRES);
		Celular celular3 = new Celular(549,011,1533897799);
		Contacto contacto3 = new Contacto("Marcela Sartori",celular3,"marcelasartori@gmail.com","Tapalque 230",2222,Localidad.Haedo,Provincia.BUENOSAIRES);
		Contacto contactos[] = {contacto1,contacto2,contacto3};
		Integer cPValido[] = {1706,1904,1132};
		Empresa empresa1 = new Empresa("Nadia Inc.",contactos,cPValido);
		Contacto contactoLlamado = empresa1.realizarNuevaLlamada();
		contactoLlamado.lLamadaExitosa("Acepta propuesta");
		Boolean llamarNuevamente = contactoLlamado.getLlamarNuevamente();
		assertFalse(llamarNuevamente);
	}
	
	@Test
	public void queLlamarNuevamenteSeaFalseSiLaLlamadaNoEsExitosaPeroSolicitaNoSerLlamado() {
		Celular celular1 = new Celular(549,011,1535080634);
		Contacto contacto1 = new Contacto("Cintia Pinaud",celular1,"cintiapinaud@gmail.com","Tapalque 230",1706,Localidad.Haedo,Provincia.BUENOSAIRES);
		Celular celular2 = new Celular(549,011,1562881349);
		Contacto contacto2 = new Contacto("Nadia Corvini",celular2,"nadiacorvini@gmail.com","Tapalque 230",1234,Localidad.Haedo,Provincia.BUENOSAIRES);
		Celular celular3 = new Celular(549,011,1533897799);
		Contacto contacto3 = new Contacto("Marcela Sartori",celular3,"marcelasartori@gmail.com","Tapalque 230",2222,Localidad.Haedo,Provincia.BUENOSAIRES);
		Contacto contactos[] = {contacto1,contacto2,contacto3};
		Integer cPValido[] = {1706,1904,1132};
		Empresa empresa1 = new Empresa("Nadia Inc.",contactos,cPValido);
		Contacto contactoLlamado = empresa1.realizarNuevaLlamada();
		contactoLlamado.noLlamar("insulta y corta");
		Boolean llamarNuevamente = contactoLlamado.getLlamarNuevamente();
		assertFalse(llamarNuevamente);
	}
	
	

}
