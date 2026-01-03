import java.util.ArrayList;//BIBLIOTECA DO ARRAY
import java.util.Scanner;//BIBLIOTECA DO SCANNER

public class Library {

    static void main() {
        //*OBJETO PARA LEITURA, RECEBER DADOS*
        Scanner scanner = new Scanner(System.in);

        //*ARMAZENAR LIVROS
        ArrayList<Book> books = new ArrayList<>();
        //*ARMAZENAR AUTORES
        ArrayList<Author> authors = new ArrayList<>();

        Actions actions = new Actions();

        //LAÇO DE REPETIÇÃO
        boolean stop = false;
        //*PARAMETROS*
        int  id_book = 1;
        int id_author = 1;

        //LISTA DE OPÇÕES PARA RODAR EM Actions.java
        do{
            int option = actions.option();
            switch (option) {
                case 1:
                    books.add(actions.addBook(id_book, authors));
                    id_book++;
                    break;
                case 2:
                    actions.listBooks(books);
                case 3:
                    authors.add(actions.addAuthor(id_author));
                    id_author++;
                    break;
                case 4:
                    actions.deleteBook(books);
                    break;
                case 5:
                    stop = true;
                    System.out.println("Exit");
            }
        }while(!stop);
    }
}
