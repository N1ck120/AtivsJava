public class livro {
    private String titulo;
    private String autor;
    private int ano;

    public void livro(){

    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void cadastroLivro(String titulo, String autor, int ano){
        setTitulo(titulo);
        setAutor(autor);
        setAno(ano);
    }

    public void livrosCadastrados(){
        System.out.println("Título: "+getTitulo());
        System.out.println("Autor: "+getAutor());
        System.out.println("Ano: "+getAno()+"\n");
    }
}
