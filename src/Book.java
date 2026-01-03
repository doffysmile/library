public class Book {

    //ATRIBUTOS DA CLASSE OBJETO (BOOK)
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int publishedYear;

    //*CLASSE CONSTRUTOR*
    // ATALHO -> BOTÃO DIREITO > GENERATE > CONSTRUCTOR
    public Book(int id, String title, String author, String publisher, int publishedYear) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishedYear = publishedYear;
    }

    //*GET SETS*
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String toDetails() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publishedYear='" + publishedYear + '\'' +
                '}';
    }
}
