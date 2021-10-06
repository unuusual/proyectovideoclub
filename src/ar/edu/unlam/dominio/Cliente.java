package ar.edu.unlam.dominio;

public abstract class Cliente {
	private String nombre;
	private Integer dni, contadorDeAlquileres;
	private Boolean esSocio;
	private TipoDeSocio tipoSocio;
	
	public Cliente(String nombre, Integer dni, Integer contadorDeAlquileres) {
		this.nombre = nombre;
		this.dni = dni;
		this.contadorDeAlquileres = contadorDeAlquileres;
	}

	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Integer getContadorDeAlquileres() {
		return contadorDeAlquileres;
	}

	public void setContadorDeAlquileres(Integer contadorDeAlquileres) {
		this.contadorDeAlquileres = contadorDeAlquileres;
	}

	public Boolean getEsSocio() {
		return esSocio;
	}

	public void setEsSocio(Boolean esSocio) {
		this.esSocio = esSocio;
	}

	public TipoDeSocio getTipoSocio() {
		return tipoSocio;
	}

	public void setTipoSocio(TipoDeSocio tipoSocio) {
		this.tipoSocio = tipoSocio;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", dni=" + dni + ", contadorDeAlquileres=" + contadorDeAlquileres
				+ ", esSocio=" + esSocio + ", tipoSocio=" + tipoSocio + "]";
	}
	
	
	
	
}
