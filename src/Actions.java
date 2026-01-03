import java.util.ArrayList;
import java.util.Scanner;

public class Actions {

    //OPÇÕES DE Library.java
    public int option(){
        //*RECEBER DADOS*
        Scanner scanner = new Scanner(System.in);
        //MENU DAS OPÇÕES
        System.out.println("Select an option");
        System.out.println("1 - Add Book");
        System.out.println("2 - List Books");
        System.out.println("3 - Add Author");
        System.out.println("4 - Delete Book");
        System.out.println("5 - Encerr");

        //*VARIAVEL PARA ARMAZENAR ESCOLHA DO USUARIO*
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }
    // *OPÇÃO 1 - ADICIONAR LIVROS*
    public Book addBook(int id_book){
        //*RECEBER DADOS*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Title:");
        String title = scanner.nextLine();
        System.out.println("Author:");
        String author = scanner.nextLine();
        System.out.println("Publisher:");
        String publisher = scanner.nextLine();
        System.out.println("Published Year:");
        int publishedYear = scanner.nextInt();

        // *ADICIONA LIVRO AO ARRAY EM Library.java*
        Book book = new Book(id_book, title, author, publisher, publishedYear);
        System.out.println("\n Book added\n");
        return book;
    }

    // *OPÇÃO 2 - LISTAR LIVROS*
    public void listBooks(ArrayList<Book> books){
        if (books.isEmpty()){
            System.out.println("\nNo Books Found\n");
            return;
        }else {
            System.out.println("\nList of Books\n");
            for (int i=0; i<books.size(); i++) {
                System.out.println(books.get(i).toDetails());
            }
        }

    }
}
