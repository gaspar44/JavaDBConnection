
public class init {
	private static Store almacen = new Almacen();
	
public static void main(String[] args) {
	Book Gaspar = new Book("Leyes magicas","Gaspar Herman",2018);
	almacen.InsertBook(Gaspar);
}
}