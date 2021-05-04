package es.consultaveterinaria.presentacion;

import es.consultaveterinaria.accesodatos.DaoMascota;
import es.consultaveterinaria.entidades.Mascota;

public class PresentacionConsola {

	public static void main(String[] args) {
		for(Mascota mascota: DaoMascota.obtenerTodas()) {
			System.out.println(mascota);
		}
	}

}
