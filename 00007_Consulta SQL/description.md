Dado el DER presentado

<div
  class='mu-erd'
  data-entities='{
    "libros": {
      "id_libro": {
        "type": "Integer",
        "pk": true
      },
      "titulo": {
        "type": "Text"
      },
      "autor": {
        "type": "Text"
      },
      "cantidad_reservas": {
        "type": "Integer"
      },
      "id_biblioteca": {
        "type": "Integer",
        "pk": false,
        "fk": {
          "to": { "entity": "bibliotecas", "column": "id_biblioteca" },
          "type": "many_to_one"
        }
      }
    },
    "bibliotecas": {
      "id_biblioteca": {
        "type": "Integer",
        "pk": true
      },
      "localidad": {
        "type": "Text"
      }
    }
  }'>
</div>

> Escribí una consulta SQL que liste los autores más leidos de la localidad de "San Luis". Estos son los que tienen algún libro con más de  100 reservas.