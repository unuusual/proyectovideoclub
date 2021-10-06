package ar.edu.unlam.dominio;

public class Dvd extends Pelicula {

	public Dvd(String nombre, Integer codigo, TipoDeGenero tipoDeGenero) {
		super(nombre, codigo, tipoDeGenero);
		super.setPirateable(true);
		super.setTipoDeFormato(TipoDeFormato.DVD);
	}

}
