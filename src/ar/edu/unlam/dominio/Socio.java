package ar.edu.unlam.dominio;

public class Socio extends Cliente {

	public Socio(String nombre, Integer dni, Integer contadorDeAlquileres) {
		super(nombre, dni, contadorDeAlquileres);
		super.setTipoSocio(TipoDeSocio.SOCIO);
		super.setEsSocio(true);
	}

}
