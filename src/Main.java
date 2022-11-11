import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando...");




            Generos generos = new Generos();

            generos.setId(1);

            Scanner entrada = new Scanner(System.in);
            System.out.println("Nombre:");
            generos.setNombre(entrada.next());

            System.out.println("Descripcion:");
            generos.setDescripcion(entrada.next());

            System.out.println(generos.getId());
            System.out.println(generos.getNombre());
            System.out.println(generos.getDescripcion());








            Autor autor = new Autor();

            System.out.println("Nombre:");
            autor.setNombre(entrada.next());

            System.out.println("Apellidos");
            autor.setApellidos(entrada.next());

            System.out.println("Fecha de nacimiento:");
            autor.setFecha_nacimiento(entrada.next());

            System.out.println("Localidad de nacimiento:");
            autor.setLocalidad_nacimiento(entrada.next());


            System.out.println(autor.getNombre());
            System.out.println(autor.getApellidos());
            System.out.println(autor.getFecha_nacimiento());
            System.out.println(autor.getLocalidad_nacimiento());




            Libro libro = new Libro();

            System.out.println("Titulo:");
            libro.setTitulo(entrada.next());

            System.out.println("Isbn:");
            libro.setIsbn(entrada.next());


            System.out.println("Dime el autor del libro");
            libro.setAutor(autor);

            System.out.println("Dime el genero del libro");
            libro.setGenero(generos);

            System.out.println("Fecha publicacion:");
            libro.setFecha_publicacion(entrada.next());

            System.out.println(libro.getTitulo());
            System.out.println(libro.getIsbn());
            System.out.println(libro.getAutor());
            System.out.println(libro.getGenero());
            System.out.println(libro.getFecha_publicacion());





            Usuario usuario1 = new Usuario();

            System.out.println("Nombre:");
            usuario1.setNombre(entrada.next());

            System.out.println("Apellidos:");
            usuario1.setApellidos(entrada.next());

            System.out.println("Dni:");
            usuario1.setDni(entrada.next());

            System.out.println("Telefono:");
            usuario1.setTelefono(entrada.next());

            System.out.println("Direccion:");
            usuario1.setDireccion(entrada.next());

            System.out.println("Poblacion:");
            usuario1.setPoblacion(entrada.next());

            System.out.println(usuario1.getNombre());
            System.out.println(usuario1.getApellidos());
            System.out.println(usuario1.getDireccion());
            System.out.println(usuario1.getDni());
            System.out.println(usuario1.getTelefono());
            System.out.println(usuario1.getPoblacion());


        System.out.println("Rellena los datos del prestamo...");

        Prestamo prestamo = new Prestamo();
        prestamo.setId("1");
        prestamo.setUsuarios(usuario1);
        prestamo.setLibro(libro);

        System.out.println("Fecha inicio prestamo :");
        prestamo.setDateStart(entrada.next());
        System.out.println("Fecha fin prestamo:");
        prestamo.setDateEnd(entrada.next());

    }
}