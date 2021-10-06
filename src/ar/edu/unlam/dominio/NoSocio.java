package ar.edu.unlam.dominio;

public class NoSocio extends Cliente {

	public NoSocio(String nombre, Integer dni, Integer contadorDeAlquileres) {
		super(nombre, dni, contadorDeAlquileres);
		super.setTipoSocio(TipoDeSocio.NO_SOCIO);
		super.setEsSocio(false);
	}

}
