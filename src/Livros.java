import java.util.Stack;

class Livro{
    public String nome;
    public String autor;
    public int ano;
    public int isbn;

    Livro(String nome, String autor, int ano, int isbn){
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
        this.isbn = isbn;
        return;
    }

    @Override
    public String toString() {
        return nome + "{" +
                "autor='" + autor + '\'' +
                ", ano=" + ano +
                ", isbn=" + isbn +
                '}';
    }
}

public class Livros {
    public Stack<Livro> livros = new Stack<>();
    private int cap = 15;

    void adicionar(String nome, String autor, int ano, int isbn){
        Livro livro = new Livro(nome, autor, ano , isbn);
        livros.push(livro);
    }
    
    Livro livro(){
        Livro livro = livros.peek();
        return livro;
    }

    Livro livro(String nome){
        for (int i = 0; i < livros.size(); i++) {
            Livro livro = livros.get(i);
            if (livro.nome.equals(nome)) {
                return livro;
        }
        
        }
        return null;
    }

    Livro livro(int isbn){
        for (int i = 0; i < livros.size(); i++) {
            Livro livro = livros.get(i);
            if (livro.isbn == isbn) {
                return livro;
        }
        
        }
        return null;
    }

    Livro livroPorPosicao(int indice){
        Livro livro = livros.get(indice);
        return livro;
    }
    
    
    void remover(){
        livros.pop();
    }

    void removerTudo(){
        livros.removeAllElements();
    }

    int quantidade(){
        int quantidade = livros.size();
        return quantidade;
    }

    boolean vazio(){
        return livros.isEmpty();
    }

    void imprimirLivros(){
        livros.forEach(livro -> System.out.println(livro));
        System.out.print("\n");
    }
    
    protected boolean atingiuLimite(){
        if (livros.capacity() > cap){
            return true;
        }
        return false;
    }
}
