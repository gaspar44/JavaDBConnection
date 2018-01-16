
public interface Tienda {
	public void BuyBook(String BookToBuy,Store store);
	
	public void SellBook(String BookToSell,Store store);
	
	public boolean CheckAvalibility(String BookName,Store store);
}
