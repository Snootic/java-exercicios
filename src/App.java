import java.util.Scanner;

public class App {
    static Livros livros = new Livros();
    static Scanner scan = new Scanner(System.in);

    public static void imprimirLivro (){
        Livro livro = livros.livro();

        System.out.println(livro);
        System.out.println(livro.nome);
        System.out.println(livro.autor);
        System.out.println(livro.ano);
        System.out.println(livro.isbn);
        System.out.print("\n");
    }

    public static void livrosVazio(){
        if (livros.vazio()){
            System.out.println("Pilha de livros está vazia");
        }else{
            System.out.println("Pilha de livros não está vazia");
            System.out.println("Há atualmente " + livros.quantidade() + " livros nesta pilha\n");
        }
    }

    public static void Livros(){

        livros.adicionar("Bananas", "Bananinha", 2016, 2778);
        livros.adicionar("Jujutsu Kaisen", "Gege Akutami", 2018, 3301);
        livros.adicionar("Tokyo Ghoul:re", "Ishida Sui", 2014, 9922);
        livros.adicionar("Chainsaw Man", "Tatsuki Fujimoto", 2018, 4432);
        livros.adicionar("One punch man", "One", 2012, 5513);

        Livro livro = livros.livro("Jujutsu Kaisen");
        System.out.println(livro);

        livro = livros.livro(2778);
        System.out.println(livro + "\n");

        System.out.print("Digite o nome do livro: ");
        String livroNome = scan.nextLine();
        System.out.print("Digite o autor do livro: ");
        String livroAutor = scan.nextLine();
        System.out.print("Digite o ano do livro: ");
        int livroAno = scan.nextInt();
        System.out.print("Digite o isbn do livro: ");
        int livroISBN = scan.nextInt();
        System.out.print("\n");

        livros.adicionar(livroNome, livroAutor, livroAno, livroISBN);

        imprimirLivro();

        livros.imprimirLivros();

        livros.remover();

        livrosVazio();

        int livrosQuantidade = livros.quantidade();
        while (!livros.atingiuLimite()){
            livrosQuantidade+= 1;
            scan.nextLine();
            System.out.print("Digite o nome do " + livrosQuantidade +  "° livro: ");
            livroNome = scan.nextLine();
            System.out.print("Digite o autor do " + livrosQuantidade +  "° livro: ");
            livroAutor = scan.nextLine();
            System.out.print("Digite o ano do " + livrosQuantidade +  "° livro: ");
            livroAno = scan.nextInt();
            System.out.print("Digite o isbn do " + livrosQuantidade +  "° livro: ");
            livroISBN = scan.nextInt();
            System.out.print("\n");
    
            livros.adicionar(livroNome, livroAutor, livroAno, livroISBN);
        }
        System.out.println("\nA pilha de livros atingiu o limite (15 livros)\n");

        livros.imprimirLivros();

        livros.remover();

        imprimirLivro();

        livros.removerTudo();

        livrosVazio();
    }
    public static void main(String[] args) throws Exception {
        // Livros();
        Numeros numeros = new Numeros();

        for (int i=1; i <11; i++){
            System.out.print("Digite o " + i + "° número: ");
            numeros.adicionar(scan.nextInt());
        }

        if (numeros.numeros.isEmpty()){
            System.out.println("Lista 'Números' está vazia");
        }else{
            numeros.numeros.forEach(numero -> System.out.println(numero));
        }
        
        System.out.print("Pilha 'Números': ");
        System.out.println(numeros.numeros.toString());

        System.out.print("Pilha 'Pares': ");
        System.out.println(numeros.num_Pares.toString());

        System.out.print("Pilha 'Ímpares': ");
        System.out.println(numeros.num_Impares.toString());



    }
}
