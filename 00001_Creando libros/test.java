Libro libro;

@Before
public void before() {
  libro = new Libro("un mundo feliz", "aldous huxley", 8);  
}


@Test
public void el_libro_tiene_titulo_un_mundo_feliz() {
  Assert.assertEquals("un mundo feliz", libro.getTitulo());
}

@Test
public void el_libro_tiene_autor_aldous_huxley() {
  Assert.assertEquals("aldous huxley", libro.getAutor());
}

@Test
public void el_libro_tiene_cantidad_de_reservas_8() {
  Assert.assertEquals(8, libro.getCantidadDeReservas());
}

@Test
public void se_puede_cambiar_la_cantidad_de_reservas_del_libro() {
  libro.setCantidadDeReservas(10);  
  Assert.assertEquals(10, libro.getCantidadDeReservas());
}