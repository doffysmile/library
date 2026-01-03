import java.util.ArrayList;//BIBLIOTECA DO ARRAY
import java.util.Scanner;//BIBLIOTECA DO SCANNER

public class Library {

    static void main() {
        //*OBJETO PARA LEITURA, RECEBER DADOS*
        Scanner scanner = new Scanner(System.in);

        //*ARMAZENAR LIVROS*
        //*NOME -> book
        ArrayList<Book> books = new ArrayList<>();

        Actions actions = new Actions();

        //LAÇO DE REPETIÇÃO
        boolean stop = false;

        int  id_book = 1;
        //*PARAMETROS*
        //LISTA DE OPÇÕES PARA RODAR EM Actions.java
        do{
            int option = actions.option();
            switch (option) {
                case 1:
                    books.add(actions.addBook(id_book));
                    id_book++;
                    break;
                case 2:
                    actions.listBooks(books);
                case 5:
                    stop = true;
                    System.out.println("Exit");

            }
        }while(!stop);
    }
}
