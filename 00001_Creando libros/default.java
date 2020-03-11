class Biblioteca {
  String localidad;
  List<Libro> libros;
  
  Biblioteca(String localidad, List<Libro> libros) {
    this.localidad = localidad;
    this.libros = libros;
  }
  
  String getLocalidad() {
    return this.localidad;
  }

  List<Libro> getLibros() {
    return this.libros;
  }
  
  void setLibros(List<Libro> libros) {
    this.libros = libros;
  }
}