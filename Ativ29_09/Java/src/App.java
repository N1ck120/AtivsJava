import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        livro livro1 = new livro();
        String t, a;
        int i = 0;
        while(i == 0){
            System.out.println("OPÇÕES\nCadastar: C | Consultar cadastrados: R | Editar: E | Sair: Q");
            switch(sc.nextLine()) {
                case "c","C":
                System.out.println("Digite o titulo:");
                t = sc.nextLine();
                System.out.println("\nDigite o autor:");
                a = sc.nextLine();
                System.out.println("\nDigite o ano:");
                livro1.cadastroLivro(t, a, sc.nextInt());
                sc.nextLine();
                  break;
                case "r","R":
                livro1.livrosCadastrados();
                  break;
                case "e","E":
                System.out.println("Titulo atual: "+ livro1.getTitulo()+"\nNovo título:");
                t = sc.nextLine();
                System.out.println("\nAutor atual: "+livro1.getAutor()+"\nNovo autor:");
                a = sc.nextLine();
                System.out.println("\nAno atual: "+livro1.getAno()+"\nNovo ano:");
                livro1.cadastroLivro(t, a, sc.nextInt());
                sc.nextLine();
                  break;
                case "q","Q":
                System.out.println("Saindo...");
                i = 1;
                  break;
                default:
                System.out.println("Opção inválida\n");
              }
        }
    }
}