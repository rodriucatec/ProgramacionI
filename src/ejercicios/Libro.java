package ejercicios;

public class Libro {
    private String titulo;
    private int num_pags;
    private String autor;
    private String editorial;

    public Libro(String titulo, int num_pags, String autor, String editorial) {
        this.titulo = titulo;
        this.num_pags = num_pags;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNum_pags() {
        return num_pags;
    }

    public void setNum_pags(int num_pags) {
        this.num_pags = num_pags;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
