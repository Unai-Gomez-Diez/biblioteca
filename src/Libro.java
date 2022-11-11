public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;
    private Generos genero;
    private String fecha_publicacion;

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public Autor getAutor(){
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public Generos getGenero(){
        return genero;
    }
    public void setGenero(Generos genero) {
        this.genero = genero;
    }
    public String getFecha_publicacion(){
        return fecha_publicacion;
    }

    public void setFecha_publicacion(String fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }


}
