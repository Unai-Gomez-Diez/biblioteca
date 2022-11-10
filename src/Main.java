import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando...");



        Scanner decision1 = new Scanner(System.in);
        System.out.println("¿Deseas introducir un nuevo genero? yes(1)/no(0)");
        Integer elecion1 = decision1.nextInt();


        if (elecion1 == 1) {
            Generos generos = new Generos();

            generos.setId(1);

            Scanner entrada16 = new Scanner(System.in);
            System.out.println("Dime el nombre del genero");
            String nombgen = entrada16.next();
            generos.setNombre(nombgen);

            Scanner entrada17 = new Scanner(System.in);
            System.out.println("Dime la descripcion del genero");
            String descgen = entrada17.next();
            generos.setDescripcion(descgen);

            System.out.println(generos.getId());
            System.out.println(generos.getNombre());
            System.out.println(generos.getDescripcion());


        }


        Scanner decision2 = new Scanner(System.in);
        System.out.println("¿Deseas introducir un nuevo autor? yes(1)/no(0)");
        Integer elecion2 = decision2.nextInt();


        if (elecion2 == 1) {

            Autor autor = new Autor();

            Scanner entrada = new Scanner(System.in);
            System.out.println("Dime el nombre del autor");
            String nombaut = entrada.next();
            autor.setNombre(nombaut);

            Scanner entrada2 = new Scanner(System.in);
            System.out.println("Dime el apellido del autor");
            String apelaut = entrada2.next();
            autor.setApellidos(apelaut);

            Scanner entrada3 = new Scanner(System.in);
            System.out.println("Dime la fecha de nacimiento del autor");
            String fechaut = entrada3.next();
            autor.setFecha_nacimiento(fechaut);

            Scanner entrada4 = new Scanner(System.in);
            System.out.println("Dime la localidad de nacimiento del autor");
            String locaaut = entrada4.next();
            autor.setLocalidad_nacimiento(locaaut);


            System.out.println(autor.getNombre());
            System.out.println(autor.getApellidos());
            System.out.println(autor.getFecha_nacimiento());
            System.out.println(autor.getLocalidad_nacimiento());
        }


        Scanner decision3 = new Scanner(System.in);
        System.out.println("¿Deseas introducir un nuevo libro? yes(1)/no(0)");
        Integer elecion3 = decision3.nextInt();


        if (elecion3 == 1) {

            Libro libro = new Libro();

            Scanner entrada5 = new Scanner(System.in);
            System.out.println("Dime el titulo del libro");
            String titulib = entrada5.next();
            libro.setTitulo(titulib);

            Scanner entrada6 = new Scanner(System.in);
            System.out.println("Dime el Isbn del libro");
            String isbnlib = entrada6.next();
            libro.setIsbn(isbnlib);

            Scanner entrada7 = new Scanner(System.in);
            System.out.println("Dime el autor del libro");
            String autolib = entrada7.next();
            libro.setAutor(autolib);

            Scanner entrada8 = new Scanner(System.in);
            System.out.println("Dime el genero del libro");
            String genelib = entrada8.next();
            libro.setGenero(genelib);

            Scanner entrada9 = new Scanner(System.in);
            System.out.println("Dime la fecha de publicacion del libro");
            String fechlib = entrada9.next();
            libro.setFecha_publicacion(fechlib);

            System.out.println(libro.getTitulo());
            System.out.println(libro.getIsbn());
            System.out.println(libro.getAutor());
            System.out.println(libro.getGenero());
            System.out.println(libro.getFecha_publicacion());
        }



        Scanner decision4 = new Scanner(System.in);
        System.out.println("¿Deseas introducir un nuevo usuario? yes(1)/no(0)");
        Integer elecion4 = decision4.nextInt();


        if (elecion4 == 1) {

            Usuario usuario1 = new Usuario();

            Scanner entrada10 = new Scanner(System.in);
            System.out.println("Dime el nombre del usuario");
            String nombusu = entrada10.next();
            usuario1.setNombre(nombusu);

            Scanner entrada11 = new Scanner(System.in);
            System.out.println("Dime los apellidos del usuario");
            String apelusu = entrada11.next();
            usuario1.setApellidos(apelusu);

            Scanner entrada12 = new Scanner(System.in);
            System.out.println("Dime el dni del usuario");
            String dniusu = entrada12.next();
            usuario1.setDni(dniusu);

            Scanner entrada13 = new Scanner(System.in);
            System.out.println("Dime el numero de telefono del usuario");
            String teleusu = entrada13.next();
            usuario1.setTelefono(teleusu);

            Scanner entrada14 = new Scanner(System.in);
            System.out.println("Dime la direccion del usuario");
            String direusu = entrada14.next();
            usuario1.setDireccion(direusu);

            Scanner entrada15 = new Scanner(System.in);
            System.out.println("Dime la poblacion del usuario");
            String poblusu = entrada15.next();
            usuario1.setPoblacion(poblusu);

            System.out.println(usuario1.getNombre());
            System.out.println(usuario1.getApellidos());
            System.out.println(usuario1.getDireccion());
            System.out.println(usuario1.getDni());
            System.out.println(usuario1.getTelefono());
            System.out.println(usuario1.getPoblacion());
        }
    }
}