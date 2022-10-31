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

	@Override
	public void bienvenida() {
		System.out.println("!bienvenido a nuestra tienda¡");
		System.out.println("Si eres menor de edad fuera de aqui!");
	}
}
