public class Revista extends Libro {

	public String genero;

	@Override
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("nuevo mostrarDatos");

	}

	public void mostrarRevista() {

		//System.out.println("titulo" + titulo);
		//System.out.println("paginas: " + páginas);
		System.out.println("genero:" + genero);

	}
}
