import java.util.ArrayList;
import java.util.Scanner;

public class Actions {

    //CLASSE DAS OPÇÕES DE Library.java
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

    // *OPÇÃO 3 - ADICIONAR AUTOR*
    public Author addAuthor(int id_author){
        //*RECEBER DADOS*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        // *ADICIONA AUTOR AO ARRAY EM Library.java*
        Author author = new Author(id_author, name);
        System.out.println("\nAuthor added\n");
        return author;
    }

    // *OPÇÃO 1 - ADICIONAR LIVROS*
    public Book addBook(int id_book, ArrayList<Author> authors){
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

        // *SELECIONAR AUTOR OU ADICIONAR UM NOVO*
        String authorName;
        if (authors.isEmpty()) {
            System.out.println("No authors registered. Enter author name:");
            authorName = scanner.nextLine();
        } else {
            System.out.println("\nRegistered Authors:");
            for (int i = 0; i < authors.size(); i++) {
                System.out.println((i+1) + " - " + authors.get(i).getName());
            }
            System.out.print("\nSelect author number (or 0 to enter new name): ");
            int authorChoice = scanner.nextInt();
            scanner.nextLine();

            if (authorChoice > 0 && authorChoice <= authors.size()) {
                authorName = authors.get(authorChoice - 1).getName();
            } else {
                System.out.print("Enter author name: ");
                authorName = scanner.nextLine();
            }
        }

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
    // *OPÇÃO 4 - DELETAR LIVROS*
    public void deleteBook(ArrayList<Book> books){
        if (books.isEmpty()){
            System.out.println("\n✗ No Books to delete\n");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        listBooks(books);

        System.out.print("Enter book ID to delete: ");
        int bookId = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == bookId) {
                books.remove(i);
                System.out.println("\n✓ Book deleted successfully!\n");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\n✗ Book not found!\n");
        }
    }
}
