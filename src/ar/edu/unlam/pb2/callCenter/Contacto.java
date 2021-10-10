package ar.edu.unlam.pb2.callCenter;

public class Contacto {
	
	
	private String nombreApellido;
	private Celular celular;
	private String mail;
	private String direccion;
	private Integer cP;
	private Boolean esCliente;
	private Boolean llamarNuevamente;
	private Localidad localidad;
	private Provincia provincia;
	private String comentario;

	public Contacto(String nombreApellido, Celular celular, String mail, String direccion, Integer cP, Localidad localidad, Provincia provincia) {
		this.nombreApellido = nombreApellido;
		this.celular = celular;
		this.mail = mail;
		this.direccion = direccion;
		this.cP= cP;
		this.localidad=localidad;
		this.provincia = provincia;
		this.esCliente = Boolean.FALSE;
		this.llamarNuevamente = Boolean.TRUE;
		this.comentario = "";
	}

	public String toString() {
		String toString = "Name: " + this.getNombreApellido() + "\n"+"Tel: " + this.getCelular() + "\n"+"Tel: ";
		
		return toString;
	}

	
	public Boolean getEsCliente() {
		return esCliente;
	}

	public void setEsCliente(Boolean esCliente) {
		this.esCliente = esCliente;
	}

	public Boolean getLlamarNuevamente() {
		return llamarNuevamente;
	}

	public void setLlamarNuevamente(Boolean llamarNuevamente) {
		this.llamarNuevamente = llamarNuevamente;
	}

	public Integer getcP() {
		Integer cP=this.cP;
		return cP;
	}
	
	public String getNombreApellido() {
		return nombreApellido;
	}

	public Celular getCelular() {
		return celular;
	}

	public String getMail() {
		return mail;
	}

	public String getDireccion() {
		return direccion;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void lLamadaExitosa(String string) {
		this.llamarNuevamente=Boolean.FALSE;
		this.esCliente=Boolean.TRUE;
		this.comentario = this.comentario + "|" +string;
		
	}

	public void noLlamar(String string) {
		this.llamarNuevamente=Boolean.FALSE;
		this.comentario = this.comentario + "|" +string;;
	}
}
