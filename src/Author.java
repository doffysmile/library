import java.util.ArrayList;

public class Author {

    //*ATRIBUTOS DE Author*
    private int id_author;
    private String name;

    //*CONSTRUTOR*
    public Author(int id, String name) {
        this.id_author = id;
        this.name = name;
    }

    ArrayList <Author> authors = new ArrayList <>();

    public int getId_author() {
        return id_author;
    }
    public void setId_author(int id_author) {
        this.id_author = id_author;
    }
    public String getName() {
        return name;
    }

}
