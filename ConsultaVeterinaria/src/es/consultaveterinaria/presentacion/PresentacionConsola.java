package es.consultaveterinaria.presentacion;

import java.time.LocalDate;

import es.consultaveterinaria.accesodatos.DaoMascota;
import es.consultaveterinaria.entidades.Mascota;

public class PresentacionConsola {

	public static void main(String[] args) {
		for(Mascota mascota: DaoMascota.obtenerTodas()) {
			System.out.println(mascota);
		}
		
		Mascota mascota1 = DaoMascota.obtenerPorId(1);
		
		System.out.println(mascota1);
		
		DaoMascota.insertar(new Mascota(null, "Rayitas", LocalDate.now()));
		DaoMascota.modificar(new Mascota(2, "Tocadita", LocalDate.now()));
		DaoMascota.borrar(1);
	}
}
