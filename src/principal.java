
public class principal {
    public static void main(String[] args) {
        
        Livro livro1 = new Livro();
        livro1.Autor = "Rodrigo";
        livro1.Título = "Java";
        livro1.Editora = "Senai";
        livro1.Páginas = 24;
        livro1.Preço = 35.50;
        
        livro1.imprimir();
        
        Livro livro2 = new Livro();
        livro2.Autor = "Fernando Alsemo";
        livro2.Título = "Aplicando Lógica Orientada a objetos em Java";
        livro2.Editora = "Visual Books";
        livro2.Páginas = 300;
        livro2.Preço = 80;
        
        livro2.imprimir();
    }
}
