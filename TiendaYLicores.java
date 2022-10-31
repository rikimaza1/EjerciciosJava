package ejercicios;

public class TiendaYLicores {

	public static void main(String[] args) {
		Licores licores = new Licores();
		licores.bienvenida();
	}

	public TiendaYLicores() {
	}

	public void bienvenida() {
		System.out.println("!bienvenido a nuestra tienda¡");
	}
}

class Licores extends TiendaYLicores {
	public Licores() {
		super();
	}
}
