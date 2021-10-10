package ar.edu.unlam.pb2.callCenter;

public class Empresa {

	private String nombre;
	private Contacto[] contactos;
	private Integer[] cPValido;

	public Empresa(String nombre,Contacto contactos[],Integer cPValido[]) {
		this.nombre=nombre;
		this.contactos = contactos;
		this.cPValido = cPValido;
	}

	public Contacto realizarNuevaLlamada() {
		Contacto contacto=this.contactos[this.buscarAlCandidato()];
		String datos = this.contactos[this.buscarAlCandidato()].toString();
		return contacto;
	}

	private Integer buscarAlCandidato() {
		Integer indice = 0;
		for(int i = 0;i<this.contactos.length;i++) {
			if (Boolean.FALSE.equals(this.contactos[i].getEsCliente())) {
				if(Boolean.TRUE.equals(this.contactos[i].getLlamarNuevamente())) {
					if(Boolean.TRUE.equals(this.esValido(this.contactos[i].getcP()))) {
						indice = i;
						break;
					}
				}
			}
		}
		
		return indice;
	}

	private Object esValido(Integer cP) {
		Boolean esValido = Boolean.FALSE;
		Integer cPObtenido = cP;
		for(int i = 0;i<this.cPValido.length;i++) {
			if(cPObtenido.equals(this.cPValido[i])) {
				esValido = Boolean.TRUE;
			}
		}
		return esValido;
	}

	
}
