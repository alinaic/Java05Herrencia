public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final Libro nuevo = new Libro();
		nuevo.titulo = "El Quijote";
		nuevo.p�ginas = 555;

		Libro otro = new Libro();
		otro.titulo = "Aprenda Java";
		otro.p�ginas = 120;

		Revista objetoRevista = new Revista();
		objetoRevista.titulo = "Muy interesante";
		objetoRevista.p�ginas = 60;
		objetoRevista.genero = "ciencia y cultura";

		nuevo.mostrarDatos();
		otro.mostrarDatos();
		objetoRevista.mostrarDatos();

	}

}
