package ar.edu.unlam.dominio;

public abstract class Pelicula {
	private String nombre;
	private Integer codigo;
	private Boolean disponible;
	private Boolean pirateable;
	private TipoDeFormato tipoDeFormato;
	private TipoDeGenero tipoDeGenero;
	
	public Pelicula(String nombre, Integer codigo, TipoDeGenero tipoDeGenero) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.disponible = true;
		this.tipoDeGenero = tipoDeGenero;
		
	}
	
	public String decirSiEsPirateable() {
		String mensaje = "";
		if(this.pirateable) {
			mensaje = "Soy pirateable";
		}
		else {
			mensaje = "ERROR! No soy piratable";
		}
		return mensaje;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}

	public Boolean getPirateable() {
		return pirateable;
	}

	public void setPirateable(Boolean pirateable) {
		this.pirateable = pirateable;
	}

	public TipoDeFormato getTipoDeFormato() {
		return tipoDeFormato;
	}

	public void setTipoDeFormato(TipoDeFormato tipoDeFormato) {
		this.tipoDeFormato = tipoDeFormato;
	}

	public TipoDeGenero getTipoDeGenero() {
		return tipoDeGenero;
	}

	public void setTipoDeGenero(TipoDeGenero tipoDeGenero) {
		this.tipoDeGenero = tipoDeGenero;
	}
	
	
	
	
}
