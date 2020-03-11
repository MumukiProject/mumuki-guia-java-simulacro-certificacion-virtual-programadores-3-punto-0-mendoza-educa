Libro libro;
Libro otroLibro;
Biblioteca biblioteca;

@Before
public void before() {
  libro = new Libro("un mundo feliz", "aldous huxley", 8);
  otroLibro = new Libro("farenheit 451", "ray bradbury", 5);
  ArrayList<Libro> libros = new ArrayList<Libro>();
  libros.add(libro);
  libros.add(otroLibro);
  biblioteca = new Biblioteca("Villa Mercedes", libros);
}

@Test
public void se_puede_registrar_una_reserva_en_un_libro() {
  libro.registrarReserva();
  Assert.assertEquals(9, libro.getCantidadDeReservas());
}

@Test
public void se_puede_limpiar_las_reservas_de_una_biblioteca() {
  biblioteca.limpiarReservas();
  Assert.assertEquals(0, libro.getCantidadDeReservas());
  Assert.assertEquals(0, otroLibro.getCantidadDeReservas());
}