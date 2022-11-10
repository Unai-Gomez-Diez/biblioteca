public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando...");

        Libro creando_un_campeon= new Libro();
        creando_un_campeon.setTitulo("Creando un campeon");
        creando_un_campeon.setIsbn("13: 9781502759795");
        creando_un_campeon.setAutor("Team Zelda");
        creando_un_campeon.setGenero("ilustrativo");
        creando_un_campeon.setFecha_publicacion("20/11/2018");

        System.out.println(creando_un_campeon.getTitulo());
        System.out.println(creando_un_campeon.getIsbn());
        System.out.println(creando_un_campeon.getAutor());
        System.out.println(creando_un_campeon.getGenero());
        System.out.println(creando_un_campeon.getFecha_publicacion());


        Usuario usuario1= new Usuario();
        usuario1.setNombre("Unai");
        usuario1.setApellidos("Gómez Díez");
        usuario1.setDni("30657984Z");
        usuario1.setTelefono("602857595");
        usuario1.setDireccion("Agustin Rodrigez Sahagun");
        usuario1.setPoblacion("Avila");

        System.out.println(usuario1.getNombre());
        System.out.println(usuario1.getApellidos());
        System.out.println(usuario1.getDireccion());
        System.out.println(usuario1.getDni());
        System.out.println(usuario1.getTelefono());
        System.out.println(usuario1.getPoblacion());


        Generos ilustrativo= new Generos();
        ilustrativo.setId(1);
        ilustrativo.setNombre("ilustrativo");
        ilustrativo.setDescripcion("Muestra ilustraciones y explicaciones sobre el tema del que trata el libro");

        System.out.println(ilustrativo.getId());
        System.out.println(ilustrativo.getNombre());
        System.out.println(ilustrativo.getDescripcion());


        Autor eiji= new Autor();
        eiji.setNombre("Eiji");
        eiji.setApellidos("Aonuma");
        eiji.setFecha_nacimiento("16/03/1963");
        eiji.setLocalidad_nacimiento("Japonesa");


        System.out.println(eiji.getNombre());
        System.out.println(eiji.getApellidos());
        System.out.println(eiji.getFecha_nacimiento());
        System.out.println(eiji.getLocalidad_nacimiento());


    }
}