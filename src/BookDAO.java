import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookDAO {

    public void addBook(Book book) {

        String sql = "INSERT INTO BOOKS (TITLE, AUTHOR, PUBLISHER, PUBLISHED_YEAR) VALUES (?, ?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps = Conection.getConnection().prepareStatement(sql);
            // ATRIBUTOS DA TABELA BOOK
            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setString(3, book.getPublisher());
            ps.setInt(4, book.getPublishedYear());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
