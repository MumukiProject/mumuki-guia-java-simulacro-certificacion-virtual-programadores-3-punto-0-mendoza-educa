A partir del siguiente DER

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

> Elegí las opciones correctas