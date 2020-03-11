¿Qué hace el método `reservas`?

```java
public int reservas() {
  return libros.stream().mapToInt(algo -> algo.getCantidadDeReservas()).sum();
}
```

> Indicá cuál de las siguientes opciones responde a la pregunta inicial.