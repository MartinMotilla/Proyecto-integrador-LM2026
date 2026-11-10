# 🕯️ Proyecto Integrador: Colección Cofrade

## 1. Descripción del proyecto

Este proyecto consiste en desarrollar una página web dedicada a mi colección de artículos relacionados con la Semana Santa.

Soy coleccionista de artículos cofrades desde 2019 y mi objetivo es conseguir en 2028 un **Guinness World Records** con la colección cofrade más grande del mundo.

Actualmente, mi colección cuenta con más de 1000 artículos de diferentes hermandades, agrupaciones, ciudades, barrios, pueblos y años.

La colección está formada por artículos de todo tipo, desde estampitas y medallitas hasta libros, revistas, calendarios y programas de Semana Santa.

## 2. Objetivos del proyecto

- Dar a conocer mi colección cofrade.
- Mostrar los diferentes artículos que forman parte de ella.
- Organizar los artículos por categorías.
- Registrar los artículos recibidos y su fecha de adquisición.
- Documentar el crecimiento de la colección.
- Dar visibilidad a las personas y negocios que colaboran mediante donaciones.
- Conseguir el Guinness World Records 2028.

## 3. Contenido de la página web

El sitio web está dividido en tres apartados principales:

### 🏠 Inicio (`proyecto/index.html`)

Es la página principal del proyecto.

Incluye:

- Presentación personal y explicación de la colección.
- Historia y evolución de la colección.
- Objetivo Guinness World Records 2028.
- Actualizaciones sobre los artículos recibidos.
- Listado de los diferentes tipos de artículos.
- Enlace a la página oficial de Guinness World Records.
- Información general del proyecto.

### 📦 Artículos (`proyecto/articulos.html`)

Esta página muestra una tabla con información sobre los artículos de la colección.

Los datos que se recogen son:

- Número de artículo.
- Tipo de artículo.
- Hermandad o agrupación.
- Figuras principales.
- Figuras secundarias.
- Ciudad, barrio o pueblo.
- Si tiene música o no.
- Banda de música.

También incluye imágenes relacionadas con diferentes hermandades y agrupaciones.

### 📩 Contacto (`proyecto/contacto.html`)

Apartado destinado a facilitar la comunicación con otras personas que quieran colaborar con la colección.

Incluye:

- Correo electrónico de contacto.
- Información sobre los artículos que se pueden donar.
- Formulario para introducir nombre, correo electrónico y teléfono.
- Campo para escribir un mensaje.
- Selector de tipos de artículos.
- Preguntas relacionadas con la Semana Santa y el material cofrade.
- Botones para enviar o borrar el formulario.

## 4. Tipos de artículos de la colección

La colección incluye diferentes categorías:

- Estampitas.
- Holy cards.
- Pósteres.
- Calendarios cofrades.
- Medallitas.
- Medallas de hermandades.
- Rosarios.
- Pulseras.
- Balconeras de tela.
- Imanes.
- Libros.
- Revistas.
- Programas de Semana Santa.
- Anuarios.
- Boletines.
- Pins.
- Llaveros.

La colección está abierta a artículos de cualquier lugar y año. Cuanto más antiguo sea un artículo, más especial resulta para la colección.

## 5. Tecnologías y herramientas utilizadas

- **HTML5:** estructura y contenido de las páginas web.
- **CSS3:** diseño y presentación visual de los contenidos.
- **XML:** organización y almacenamiento de información de los artículos.
- **DTD y XSD:** tecnologías utilizadas para definir estructuras y validar documentos XML.
- **Visual Studio Code:** editor utilizado para desarrollar el proyecto.
- **Git:** control de versiones.
- **GitHub:** alojamiento del repositorio y seguimiento de los cambios.

## 6. Estructura del proyecto

```text
Proyecto-integrador-LM2026/
│
├── README.md
├── img/
│   ├── ap humildad.jpg
│   ├── cristo cigarreras.jpg
│   ├── cristo macarena.jpg
│   ├── cristo san esteban.jpg
│   ├── cristo y virgen de triana.jpg
│   ├── cristo y virgen los panaderos.jpg
│   ├── cristo y virgen san gonzalo.jpg
│   ├── guinness rold record 2027.png
│   ├── gwr_2027.jpg
│   ├── libro-gwr.jpg
│   ├── san pablo.jpg
│   └── virgen macarena.jpg
│
└── proyecto/
    ├── .gitignore
    ├── index.html
    ├── articulos.html
    ├── contacto.html
    ├── datos.xml
    ├── datos.dtd
    ├── datos.xsd
    │
    └── CSS/
        └── articulos.css
```

## 7. Organización y seguimiento de la colección

Para llevar un control de los artículos, utilizo diferentes datos que permiten identificar cada incorporación:

- **Número de artículo:** permite conocer la cantidad de artículos registrados.
- **Fecha de adquisición:** permite saber cuándo recibí cada artículo.
- **Tipo de artículo:** permite clasificarlo según su categoría.
- **Hermandad o agrupación:** permite identificar su procedencia cofrade.

Además, quiero dedicar una sección del proyecto a las personas y negocios que colaboran con donaciones para reconocer su participación.

## 8. Entregas del proyecto

- **UD1-UD2:** primera entrega del proyecto, trabajando con HTML y XML.
- **UD3:** ampliación y mejora del sitio web, incorporando nuevos contenidos y estilos CSS.
- **UD5:** incorporación de una tabla de artículos y un formulario de contacto.

## 9. Trabajo realizado en la UD5: Tablas y formularios

### Tabla de artículos

En esta unidad he trabajado con la tabla de artículos de mi colección, utilizando diferentes elementos HTML para organizar los datos:

- `<caption>` para añadir el título de la tabla.
- `<thead>` para agrupar los encabezados.
- `<tbody>` para agrupar los datos.
- `<tfoot>` para incluir el resumen final.
- `<th>` para identificar los encabezados de columnas y filas.
- `<colgroup>` y `<col>` para organizar las columnas.
- `colspan` para combinar celdas horizontalmente.
- `rowspan` para combinar celdas verticalmente.

También he utilizado los atributos `scope="col"` y `scope="row"` para mejorar la accesibilidad de la tabla.

### Formulario de contacto

He creado un formulario para que otras personas puedan ponerse en contacto conmigo y ofrecer artículos para la colección.

El formulario utiliza:

- Dos grupos de campos (`fieldset`) con sus correspondientes leyendas (`legend`).
- Etiquetas (`label`) asociadas a sus campos.
- Campos de texto, correo electrónico, teléfono, URL, número y fecha.
- Casillas de verificación (`checkbox`).
- Botones de opción (`radio`).
- Un selector de tipos de artículos (`select`).
- Un área de texto (`textarea`).
- Botones para enviar y borrar los datos.

También he utilizado atributos como `required`, `minlength`, `maxlength`, `placeholder` y `autofocus` para mejorar el funcionamiento del formulario.

### Prueba del método GET

Durante la comprobación del formulario he utilizado la siguiente dirección local para abrir la página:

`http://127.0.0.1:3000/LENGUAJE%20DE%20MARCAS/Proyecto-integrador-LM2026/proyecto/contacto.html?vscode-livepreview=true`

El método GET permite enviar los datos mediante la dirección URL, mientras que el método POST los envía en el cuerpo de la petición.

### ¿Por qué utilizo POST?

Finalmente, he dejado el formulario con `method="post"` porque los datos se envían en el cuerpo de la petición y no aparecen directamente en la dirección URL. Esto resulta más adecuado para enviar la información del formulario.
### Validación W3C

He comprobado las páginas HTML mediante el validador W3C.

| Página | Resultado |
|---|---|
| `articulos.html` | Sin errores |
| `contacto.html` | Sin errores |

## 10. Qué he hecho en esta unidad

En esta unidad he aprendido a crear y organizar tablas HTML para mostrar información de forma ordenada. He utilizado encabezados, filas, columnas y celdas combinadas.

También he aprendido a crear formularios de contacto utilizando diferentes tipos de campos, etiquetas, botones, selectores y atributos de validación.

Por último, he comprobado las páginas con el validador W3C y he trabajado con Git y GitHub para guardar los cambios realizados en el proyecto.

## 11. Autor

**Martín Alexey Motilla Ayuso**

1.º DAM – Desarrollo de Aplicaciones Multiplataforma.

Asignatura: Lenguaje de Marcas y Sistemas de Gestión de Información.

Curso académico: 2026/2027.

## 12. Palabra del día

### DÍA

Cada día es una nueva oportunidad para seguir haciendo crecer esta colección cofrade.

Detrás de cada artículo hay una historia, un recuerdo y una parte de la tradición de la Semana Santa que merece conservarse.

**En 2028 lo consigo.** 🕯️