package ar.edu.unlam.dominio;

public class Vhs extends Pelicula {

	public Vhs(String nombre, Integer codigo, TipoDeGenero tipoDeGenero) {
		super(nombre, codigo, tipoDeGenero);
		super.setPirateable(false);
		super.setTipoDeFormato(TipoDeFormato.VHS);
	}

}
