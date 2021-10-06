package ar.edu.unlam.dominio;

public class BluRay extends Pelicula {

	public BluRay(String nombre, Integer codigo, TipoDeGenero tipoDeGenero) {
		super(nombre, codigo, tipoDeGenero);
		super.setPirateable(false);
		super.setTipoDeFormato(TipoDeFormato.BLU_RAY);
	}



}
