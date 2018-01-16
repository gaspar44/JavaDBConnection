import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Clase que se conecta a la base de datos donde están los libros para uso de consultas
public class Almacen implements Store{
	private static String url = "jdbc:mysql://localhost:3306/BooksInStore";
	//Connection connection = DriverManager.getConnection(url, "root", "demodemo");
	
	private Connection getConnect() {
		try {
			Connection connection = DriverManager.getConnection(url, "root", "demodemo");
			return connection;
		}
		catch (SQLException e) {
			return null;
		}
	}
	
	public boolean getInfo() {
		// TODO Auto-generated method stub
		return true;
	}

	public void RemoveBook(Book BookToRemove) {
		// TODO Auto-generated method stub
		
	}

	public void InsertBook(Book BookToInsert) {
		Connection connec = getConnect();
		String query = "INTERT INTO ActuallyInStore VALUES (" + BookToInsert.getName() +", " + BookToInsert.getAuthorName()+ ", " + BookToInsert.getYearPublication()+")" +";";
		
		try {
			Statement st = connec.createStatement();
			st.executeUpdate(query);
			//ResultSet rs = st.executeQuery(query);
			connec.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
